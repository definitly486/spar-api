package xl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kcexrzcfyt extends zdlpuopuiu {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    Object f122700iwizpuwonk;

    protected kcexrzcfyt(String str) {
        vl.zoijcleaow.btonecajqb(str);
        this.f122700iwizpuwonk = str;
    }

    private void czzsidtyhn() {
        if (iwizpuwonk()) {
            return;
        }
        String str = (String) this.f122700iwizpuwonk;
        zoijcleaow zoijcleaowVar = new zoijcleaow();
        this.f122700iwizpuwonk = zoijcleaowVar;
        zoijcleaowVar.pmvmpeiblj(istkbnxepw(), str);
    }

    @Override // xl.zdlpuopuiu
    public final zoijcleaow eablkybsjg() {
        czzsidtyhn();
        return (zoijcleaow) this.f122700iwizpuwonk;
    }

    @Override // xl.zdlpuopuiu
    public String gxszxtbevo() {
        wflxmlrfwp wflxmlrfwpVar = this.f122742zdlpuopuiu;
        return wflxmlrfwpVar != null ? wflxmlrfwpVar.gxszxtbevo() : "";
    }

    @Override // xl.zdlpuopuiu
    public String iobyxmoadg(String str) {
        czzsidtyhn();
        return super.iobyxmoadg(str);
    }

    @Override // xl.zdlpuopuiu
    public String iozdgvuglv() {
        return metgxyhuhe();
    }

    @Override // xl.zdlpuopuiu
    protected final boolean iwizpuwonk() {
        return this.f122700iwizpuwonk instanceof zoijcleaow;
    }

    @Override // xl.zdlpuopuiu
    protected List kcexrzcfyt() {
        return zdlpuopuiu.f122740jyumaefscl;
    }

    String metgxyhuhe() {
        return ppxfxbqfkf(istkbnxepw());
    }

    @Override // xl.zdlpuopuiu
    public zdlpuopuiu oxmwwwfdhm() {
        return this;
    }

    @Override // xl.zdlpuopuiu
    public String ppxfxbqfkf(String str) {
        if (iwizpuwonk()) {
            return super.ppxfxbqfkf(str);
        }
        return istkbnxepw().equals(str) ? (String) this.f122700iwizpuwonk : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: rlfsiqarku, reason: merged with bridge method [inline-methods] */
    public kcexrzcfyt rgvfuqvkyq(zdlpuopuiu zdlpuopuiuVar) {
        kcexrzcfyt kcexrzcfytVar = (kcexrzcfyt) super.rgvfuqvkyq(zdlpuopuiuVar);
        if (iwizpuwonk()) {
            kcexrzcfytVar.f122700iwizpuwonk = ((zoijcleaow) this.f122700iwizpuwonk).clone();
        }
        return kcexrzcfytVar;
    }

    @Override // xl.zdlpuopuiu
    /* JADX INFO: renamed from: uwvvkdfqfp, reason: merged with bridge method [inline-methods] */
    public wflxmlrfwp hkdspvbjdz() {
        return this.f122742zdlpuopuiu;
    }

    @Override // xl.zdlpuopuiu
    protected void vdvldrhtss(String str) {
    }

    @Override // xl.zdlpuopuiu
    public int wflxmlrfwp() {
        return 0;
    }

    @Override // xl.zdlpuopuiu
    public zdlpuopuiu wkgbmnqykc(String str, String str2) {
        if (iwizpuwonk() || !str.equals(istkbnxepw())) {
            czzsidtyhn();
            super.wkgbmnqykc(str, str2);
        } else {
            this.f122700iwizpuwonk = str2;
        }
        return this;
    }
}
