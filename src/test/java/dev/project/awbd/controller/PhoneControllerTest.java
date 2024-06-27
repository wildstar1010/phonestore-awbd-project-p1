package dev.project.awbd.controller;

import dev.project.awbd.model.Phone;
import dev.project.awbd.service.PhoneService;
import dev.project.awbd.StoreApplication; // Replace with the correct configuration class if needed
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = PhoneController.class)
@ContextConfiguration(classes = StoreApplication.class) // Use the correct configuration class here
class PhoneControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PhoneService phoneService;

    @Test
    void testGetAllPhones() throws Exception {
        Pageable pageable = PageRequest.of(0, 10);
        List<Phone> phoneList = Arrays.asList(new Phone(), new Phone(), new Phone());
        Page<Phone> phonePage = new PageImpl<>(phoneList);
        when(phoneService.getAllPhones(pageable)).thenReturn(phonePage);

        mockMvc.perform(get("/phones")
                        .param("page", "0")
                        .param("size", "10"))
                .andExpect(status().isOk())
                .andExpect(view().name("phones/list"))
                .andExpect(model().attributeExists("phones"));

        verify(phoneService, times(1)).getAllPhones(pageable);
    }

    @Test
    void testGetPhoneById() throws Exception {
        Phone phone = new Phone();
        when(phoneService.getPhoneById(1L)).thenReturn(Optional.of(phone));

        mockMvc.perform(get("/phones/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("phones/detail"))
                .andExpect(model().attributeExists("phone"));

        verify(phoneService, times(1)).getPhoneById(1L);
    }

    @Test
    void testCreatePhone() throws Exception {
        Phone phone = new Phone();
        when(phoneService.savePhone(any(Phone.class))).thenReturn(phone);

        mockMvc.perform(post("/phones")
                        .flashAttr("phone", phone))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/phones"));

        verify(phoneService, times(1)).savePhone(any(Phone.class));
    }

    @Test
    void testDeletePhone() throws Exception {
        doNothing().when(phoneService).deletePhone(1L);

        mockMvc.perform(delete("/phones/1"))
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("/phones"));

        verify(phoneService, times(1)).deletePhone(1L);
    }

    @Test
    void testGetPhoneById_NotFound() throws Exception {
        when(phoneService.getPhoneById(1L)).thenReturn(Optional.empty());

        mockMvc.perform(get("/phones/1"))
                .andExpect(status().isNotFound())
                .andExpect(view().name("error/404"))
                .andExpect(model().attributeExists("error"));

        verify(phoneService, times(1)).getPhoneById(1L);
    }
}
