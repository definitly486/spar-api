package com.ctc.wstx.exc;

import javax.xml.stream.XMLStreamException;

/* JADX INFO: loaded from: classes2.dex */
public class WstxLazyException extends RuntimeException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final XMLStreamException f21758zdlpuopuiu;

    @Override // java.lang.Throwable
    public String getMessage() {
        return "[" + getClass().getName() + "] " + this.f21758zdlpuopuiu.getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "[" + getClass().getName() + "] " + this.f21758zdlpuopuiu.toString();
    }
}
