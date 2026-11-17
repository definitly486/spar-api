package yl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class rgvfuqvkyq extends ArrayList {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f125803yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f125804zdlpuopuiu;

    rgvfuqvkyq(int i13, int i14) {
        super(i13);
        this.f125804zdlpuopuiu = i13;
        this.f125803yggfygwlhe = i14;
    }

    public static rgvfuqvkyq draadjrbmk() {
        return new rgvfuqvkyq(0, 0);
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return super.clone();
    }

    boolean iobyxmoadg() {
        return size() < this.f125803yggfygwlhe;
    }

    int wkgbmnqykc() {
        return this.f125803yggfygwlhe;
    }

    rgvfuqvkyq(rgvfuqvkyq rgvfuqvkyqVar) {
        this(rgvfuqvkyqVar.f125804zdlpuopuiu, rgvfuqvkyqVar.f125803yggfygwlhe);
    }
}
