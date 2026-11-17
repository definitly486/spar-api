package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
@CheckReturnValue
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f25231id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int i13, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f25231id = i13;
        this.caseField = field;
        this.valueField = field2;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f25231id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
