package kh;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {
    public static final nufgyqmvbu iobyxmoadg(nufgyqmvbu first, nufgyqmvbu second) {
        zdlpuopuiu.btonecajqb(first, "first");
        zdlpuopuiu.btonecajqb(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new ojitshcjhn(first, second);
    }
}
