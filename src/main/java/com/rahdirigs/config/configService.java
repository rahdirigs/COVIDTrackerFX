package com.rahdirigs.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class configService {
    private final File settings = new File("info.json");
    private Gson gson = new GsonBuilder().create();

    public configModel getConfig() throws Exception {
        if (!settings.exists()) {
            createSettings();
        }
        return getConfigModel();
    }

    private void createSettings() throws IOException {
        configModel config = new configModel();
        try (Writer writer = new FileWriter(settings, false)) {
            gson.toJson(config, writer);
        }
    }

    private configModel getConfigModel() throws IOException {
        configModel config = new configModel();
        try (Reader reader = new FileReader(settings)) {
            return gson.fromJson(reader, configModel.class);
        }
    }
}
