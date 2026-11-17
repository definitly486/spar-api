package cdpycssgdh;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc implements Comparator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private boolean f19745zdlpuopuiu;

    public wkgbmnqykc() {
        this(false);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int iSignum = Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        return this.f19745zdlpuopuiu ? iSignum * (-1) : iSignum;
    }

    public wkgbmnqykc(boolean z13) {
        this.f19745zdlpuopuiu = z13;
    }
}
