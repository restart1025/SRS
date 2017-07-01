package com.github.restart1025.srs.service;

import java.util.List;
import java.util.Map;

public interface TranscriptService {

	List<Map<String, String>> queryTranscript(String ssn);

}
