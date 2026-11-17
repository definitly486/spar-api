package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class SendException extends Exception {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f24358zdlpuopuiu;

    SendException(String str) {
        super(str);
        this.f24358zdlpuopuiu = iobyxmoadg(str);
    }

    private int iobyxmoadg(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "service_not_available":
                return 3;
            case "toomanymessages":
                return 4;
            case "invalid_parameters":
            case "missing_to":
                return 1;
            case "messagetoobig":
                return 2;
            default:
                return 0;
        }
    }
}
