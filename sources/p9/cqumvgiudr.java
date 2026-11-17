package p9;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public enum cqumvgiudr {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final SparseArray f76045pmvmpeiblj;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f76048zdlpuopuiu;

    static {
        cqumvgiudr cqumvgiudrVar = DEFAULT;
        cqumvgiudr cqumvgiudrVar2 = UNMETERED_ONLY;
        cqumvgiudr cqumvgiudrVar3 = UNMETERED_OR_DAILY;
        cqumvgiudr cqumvgiudrVar4 = FAST_IF_RADIO_AWAKE;
        cqumvgiudr cqumvgiudrVar5 = NEVER;
        cqumvgiudr cqumvgiudrVar6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        f76045pmvmpeiblj = sparseArray;
        sparseArray.put(0, cqumvgiudrVar);
        sparseArray.put(1, cqumvgiudrVar2);
        sparseArray.put(2, cqumvgiudrVar3);
        sparseArray.put(3, cqumvgiudrVar4);
        sparseArray.put(4, cqumvgiudrVar5);
        sparseArray.put(-1, cqumvgiudrVar6);
    }

    cqumvgiudr(int i13) {
        this.f76048zdlpuopuiu = i13;
    }
}
