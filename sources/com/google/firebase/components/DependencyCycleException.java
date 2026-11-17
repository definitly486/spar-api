package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f24190zdlpuopuiu;

    public DependencyCycleException(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f24190zdlpuopuiu = list;
    }
}
