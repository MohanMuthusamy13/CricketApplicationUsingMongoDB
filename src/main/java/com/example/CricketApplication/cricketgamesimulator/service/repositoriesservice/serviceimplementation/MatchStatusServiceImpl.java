package com.example.CricketApplication.cricketgamesimulator.service.repositoriesservice.serviceimplementation;

import com.example.CricketApplication.cricketgamesimulator.entities.MatchStatusRecord;
import com.example.CricketApplication.cricketgamesimulator.exceptionhandler.NotFoundException;
import com.example.CricketApplication.cricketgamesimulator.repositories.MatchStatusRepository;
import com.example.CricketApplication.cricketgamesimulator.service.repositoriesservice.serviceinterfaces.MatchStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MatchStatusServiceImpl implements MatchStatusService {

    private MatchStatusRepository matchStatusRepository;

    @Autowired
    public MatchStatusServiceImpl(MatchStatusRepository matchStatusRepository) {
        this.matchStatusRepository = matchStatusRepository;
    }

    @Override
    public MatchStatusRecord save(MatchStatusRecord matchStatusRecord) {
        return matchStatusRepository.save(matchStatusRecord);
    }

    @Override
    public MatchStatusRecord getMatchRecordByMatchId(long matchId) {
        Optional<MatchStatusRecord> matchStatusRecord = matchStatusRepository.getMatchRecordByMatchId(matchId);
        if (matchStatusRecord.isPresent()) {
            return matchStatusRecord.get();
        }
        else {
            throw new NotFoundException("Match Id is Invalid");
        }
    }

    @Override
    public String getMatchStatusByMatchId(long matchId) {
        Optional<String> matchStatus = matchStatusRepository.getMatchStatusByMatchId(matchId);
        if (matchStatus.isPresent()) {
            return matchStatus.get();
        }
        else {
            throw new NotFoundException("Match Id is Invalid");
        }
    }
}