package dev.project.awbd.service;

import dev.project.awbd.model.Phone;
import dev.project.awbd.repository.PhoneRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PhoneServiceTest {

    @Mock
    private PhoneRepository phoneRepository;

    @InjectMocks
    private PhoneService phoneService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllPhones() {
        Phone phone1 = new Phone();
        phone1.setName("Phone1");
        Phone phone2 = new Phone();
        phone2.setName("Phone2");

        List<Phone> phoneList = Arrays.asList(phone1, phone2);
        Page<Phone> phonePage = new PageImpl<>(phoneList);
        Pageable pageable = PageRequest.of(0, 10);

        when(phoneRepository.findAll(pageable)).thenReturn(phonePage);

        Page<Phone> result = phoneService.getAllPhones(pageable);
        assertEquals(2, result.getTotalElements());
        verify(phoneRepository, times(1)).findAll(pageable);
    }
}
