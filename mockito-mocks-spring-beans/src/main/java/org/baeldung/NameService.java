package org.baeldung;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public String getUserName(String id) {
        return "Baeldung";
    }
}