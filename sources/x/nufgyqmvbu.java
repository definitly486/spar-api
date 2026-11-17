package x;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements pmvmpeiblj {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ojitshcjhn f120844jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final agtfadlqog f120845yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final draadjrbmk f120846zdlpuopuiu;

    public nufgyqmvbu(draadjrbmk draadjrbmkVar, agtfadlqog agtfadlqogVar, ojitshcjhn ojitshcjhnVar) {
        this.f120846zdlpuopuiu = draadjrbmkVar;
        this.f120845yggfygwlhe = agtfadlqogVar;
        this.f120844jyumaefscl = ojitshcjhnVar;
    }

    @Override // x.draadjrbmk
    public int czzsidtyhn(int i13) {
        return this.f120846zdlpuopuiu.czzsidtyhn(i13);
    }

    @Override // x.draadjrbmk
    public Object lqeggnwhkg() {
        return this.f120846zdlpuopuiu.lqeggnwhkg();
    }

    @Override // x.pmvmpeiblj
    public androidx.compose.ui.layout.kcexrzcfyt sflfametgt(long j13) {
        if (this.f120844jyumaefscl == ojitshcjhn.Width) {
            return new btonecajqb(this.f120845yggfygwlhe == agtfadlqog.Max ? this.f120846zdlpuopuiu.ydmasvzmpa(w0.zoijcleaow.gtknphoqwx(j13)) : this.f120846zdlpuopuiu.czzsidtyhn(w0.zoijcleaow.gtknphoqwx(j13)), w0.zoijcleaow.lqeggnwhkg(j13) ? w0.zoijcleaow.gtknphoqwx(j13) : 32767);
        }
        return new btonecajqb(w0.zoijcleaow.nufgyqmvbu(j13) ? w0.zoijcleaow.draadjrbmk(j13) : 32767, this.f120845yggfygwlhe == agtfadlqog.Max ? this.f120846zdlpuopuiu.yggfygwlhe(w0.zoijcleaow.draadjrbmk(j13)) : this.f120846zdlpuopuiu.wypolnanlu(w0.zoijcleaow.draadjrbmk(j13)));
    }

    @Override // x.draadjrbmk
    public int wypolnanlu(int i13) {
        return this.f120846zdlpuopuiu.wypolnanlu(i13);
    }

    @Override // x.draadjrbmk
    public int ydmasvzmpa(int i13) {
        return this.f120846zdlpuopuiu.ydmasvzmpa(i13);
    }

    @Override // x.draadjrbmk
    public int yggfygwlhe(int i13) {
        return this.f120846zdlpuopuiu.yggfygwlhe(i13);
    }
}
