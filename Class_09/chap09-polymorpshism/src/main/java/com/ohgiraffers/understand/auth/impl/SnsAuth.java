package com.ohgiraffers.understand.auth.impl;


import com.ohgiraffers.understand.dto.MemberDTO;

public interface SnsAuth {
    boolean login(MemberDTO member);
}
