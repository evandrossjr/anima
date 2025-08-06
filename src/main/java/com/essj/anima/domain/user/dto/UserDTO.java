package com.essj.anima.domain.user.dto;

import jakarta.persistence.Column;

public record UserDTO(String name,
                      String phoneNumber,
                      String email,
                      String password) {
}
