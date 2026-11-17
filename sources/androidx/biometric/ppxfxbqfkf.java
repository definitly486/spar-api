package androidx.biometric;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f3611iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CharSequence f3612zoijcleaow;

    ppxfxbqfkf(int i13, CharSequence charSequence) {
        this.f3611iobyxmoadg = i13;
        this.f3612zoijcleaow = charSequence;
    }

    private static String iobyxmoadg(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean wkgbmnqykc(CharSequence charSequence) {
        String strIobyxmoadg = iobyxmoadg(this.f3612zoijcleaow);
        String strIobyxmoadg2 = iobyxmoadg(charSequence);
        return (strIobyxmoadg == null && strIobyxmoadg2 == null) || (strIobyxmoadg != null && strIobyxmoadg.equals(strIobyxmoadg2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ppxfxbqfkf)) {
            return false;
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) obj;
        return this.f3611iobyxmoadg == ppxfxbqfkfVar.f3611iobyxmoadg && wkgbmnqykc(ppxfxbqfkfVar.f3612zoijcleaow);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3611iobyxmoadg), iobyxmoadg(this.f3612zoijcleaow)});
    }

    CharSequence ppxfxbqfkf() {
        return this.f3612zoijcleaow;
    }

    int zoijcleaow() {
        return this.f3611iobyxmoadg;
    }
}
