package io.appmetrica.analytics.networktasks.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface ArgumentsMerger<I, O> {
    boolean compareWithOtherArguments(I i13);

    O mergeFrom(I i13);
}
