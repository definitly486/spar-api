package bf;

/* JADX INFO: loaded from: classes2.dex */
public enum zoijcleaow {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f16049yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int[] f16050zdlpuopuiu;

    zoijcleaow(int[] iArr, int i13) {
        this.f16050zdlpuopuiu = iArr;
        this.f16049yggfygwlhe = i13;
    }

    public int iobyxmoadg() {
        return this.f16049yggfygwlhe;
    }

    public int wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
        char c13;
        int iGxszxtbevo = ppxfxbqfkfVar.gxszxtbevo();
        if (iGxszxtbevo <= 9) {
            c13 = 0;
        } else {
            c13 = iGxszxtbevo <= 26 ? (char) 1 : (char) 2;
        }
        return this.f16050zdlpuopuiu[c13];
    }
}
