package w4;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import q4.gtknphoqwx;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class nufgyqmvbu implements gtknphoqwx {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Map f118681cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Map f118682iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Map f118683jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long[] f118684yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ppxfxbqfkf f118685zdlpuopuiu;

    public nufgyqmvbu(ppxfxbqfkf ppxfxbqfkfVar, Map map, Map map2, Map map3) {
        this.f118685zdlpuopuiu = ppxfxbqfkfVar;
        this.f118682iwizpuwonk = map2;
        this.f118681cqumvgiudr = map3;
        this.f118683jyumaefscl = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f118684yggfygwlhe = ppxfxbqfkfVar.btonecajqb();
    }

    @Override // q4.gtknphoqwx
    public int iobyxmoadg(long j13) {
        int iWkgbmnqykc = stevsuqkhv.wkgbmnqykc(this.f118684yggfygwlhe, j13, false, false);
        if (iWkgbmnqykc < this.f118684yggfygwlhe.length) {
            return iWkgbmnqykc;
        }
        return -1;
    }

    @Override // q4.gtknphoqwx
    public long ppxfxbqfkf(int i13) {
        return this.f118684yggfygwlhe[i13];
    }

    @Override // q4.gtknphoqwx
    public int wkgbmnqykc() {
        return this.f118684yggfygwlhe.length;
    }

    @Override // q4.gtknphoqwx
    public List zoijcleaow(long j13) {
        return this.f118685zdlpuopuiu.nufgyqmvbu(j13, this.f118683jyumaefscl, this.f118682iwizpuwonk, this.f118681cqumvgiudr);
    }
}
