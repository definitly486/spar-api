package com.yandex.runtime.config;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ExperimentData implements Serializable {
    private int testId;
    private int userBucket;
    private int userGroup;

    public ExperimentData(int i13, int i14, int i15) {
        this.testId = i13;
        this.userGroup = i14;
        this.userBucket = i15;
    }

    public int getTestId() {
        return this.testId;
    }

    public int getUserBucket() {
        return this.userBucket;
    }

    public int getUserGroup() {
        return this.userGroup;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.testId = archive.add(this.testId);
        this.userGroup = archive.add(this.userGroup);
        this.userBucket = archive.add(this.userBucket);
    }

    public ExperimentData() {
    }
}
