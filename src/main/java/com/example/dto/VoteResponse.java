package com.example.dto;

import com.example.model.VoteType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoteResponse {
    private String username;
    private VoteType voteType;
}
