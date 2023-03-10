package com.example.CricketApplication.sequencegenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "sequenceGeneratorForTeams")
public class DBSequence {
    @Id
    private String id;
    private long seq;
}