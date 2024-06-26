package dev.project.awbd.service;

import dev.project.awbd.model.Phone;
import dev.project.awbd.repository.PhoneRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PhoneServiceTest2 {

    @Mock
    private PhoneRepository phoneRepository;

    @InjectMocks
    private PhoneService phoneService;

    @Test
    void testGetAllPhones() {
        Pageable pageable = PageRequest.of(0, 10);
        List<Phone> phoneList = Arrays.asList(new Phone(), new Phone(), new Phone());
        Page<Phone> phonePage = new PageImpl<>(phoneList);
        when(phoneRepository.findAll(pageable)).thenReturn(phonePage);

        Page<Phone> result = phoneService.getAllPhones(pageable);

        assertEquals(3, result.getSize());
        verify(phoneRepository, times(1)).findAll(pageable);
    }

    @Test
    void testGetPhoneById() {
        Phone phone = new Phone();
        when(phoneRepository.findById(1L)).thenReturn(Optional.of(phone));

        Optional<Phone> result = phoneService.getPhoneById(1L);

        assertTrue(result.isPresent());
        verify(phoneRepository, times(1)).findById(1L);
    }

    @Test
    void testSavePhone() {
        Phone phone = new Phone();
        when(phoneRepository.save(phone)).thenReturn(phone);

        Phone result = phoneService.savePhone(phone);

        assertEquals(phone, result);
        verify(phoneRepository, times(1)).save(phone);
    }

    @Test
    void testDeletePhone() {
        phoneService.deletePhone(1L);

        verify(phoneRepository, times(1)).deleteById(1L);
    }
}
