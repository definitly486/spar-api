package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final /* synthetic */ wflxmlrfwp[] f25191jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final wflxmlrfwp f25192yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final wflxmlrfwp f25193zdlpuopuiu;

    final enum iobyxmoadg extends wflxmlrfwp {
        iobyxmoadg(String str, int i13) {
            super(str, i13, null);
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg("DEFAULT", 0);
        f25193zdlpuopuiu = iobyxmoadgVar;
        wflxmlrfwp wflxmlrfwpVar = new wflxmlrfwp("STRING", 1) { // from class: com.google.gson.wflxmlrfwp.zoijcleaow
            {
                iobyxmoadg iobyxmoadgVar2 = null;
            }
        };
        f25192yggfygwlhe = wflxmlrfwpVar;
        f25191jyumaefscl = new wflxmlrfwp[]{iobyxmoadgVar, wflxmlrfwpVar};
    }

    private wflxmlrfwp(String str, int i13) {
        super(str, i13);
    }

    public static wflxmlrfwp valueOf(String str) {
        return (wflxmlrfwp) Enum.valueOf(wflxmlrfwp.class, str);
    }

    public static wflxmlrfwp[] values() {
        return (wflxmlrfwp[]) f25191jyumaefscl.clone();
    }

    /* synthetic */ wflxmlrfwp(String str, int i13, iobyxmoadg iobyxmoadgVar) {
        this(str, i13);
    }
}
