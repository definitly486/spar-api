package zg;

import hg.yggfygwlhe;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends yggfygwlhe {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f129939iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f129940jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f129941yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f129942zdlpuopuiu;

    public zoijcleaow(char c13, char c14, int i13) {
        this.f129942zdlpuopuiu = i13;
        this.f129941yggfygwlhe = c14;
        boolean z13 = false;
        if (i13 <= 0 ? zdlpuopuiu.draadjrbmk(c13, c14) >= 0 : zdlpuopuiu.draadjrbmk(c13, c14) <= 0) {
            z13 = true;
        }
        this.f129940jyumaefscl = z13;
        this.f129939iwizpuwonk = z13 ? c13 : c14;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f129940jyumaefscl;
    }

    @Override // hg.yggfygwlhe
    public char iobyxmoadg() {
        int i13 = this.f129939iwizpuwonk;
        if (i13 != this.f129941yggfygwlhe) {
            this.f129939iwizpuwonk = this.f129942zdlpuopuiu + i13;
        } else {
            if (!this.f129940jyumaefscl) {
                throw new NoSuchElementException();
            }
            this.f129940jyumaefscl = false;
        }
        return (char) i13;
    }
}
