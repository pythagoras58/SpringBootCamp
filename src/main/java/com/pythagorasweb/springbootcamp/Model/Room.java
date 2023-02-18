package com.pythagorasweb.springbootcamp.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Room {

    private long id;
    private String name;
    private String number;
    private String info;
}
