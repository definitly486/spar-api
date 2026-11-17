package kk;

import spay.sdk.api.SPayStage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r00 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final /* synthetic */ int[] f58257iobyxmoadg;

    static {
        int[] iArr = new int[SPayStage.values().length];
        try {
            iArr[SPayStage.SandboxRealBankApp.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SPayStage.SandBoxWithoutBankApp.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f58257iobyxmoadg = iArr;
    }
}
