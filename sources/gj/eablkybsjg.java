package gj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg extends iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ppxfxbqfkf f37543zdlpuopuiu;

    protected eablkybsjg(ppxfxbqfkf arrayMap) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arrayMap, "arrayMap");
        this.f37543zdlpuopuiu = arrayMap;
    }

    @Override // gj.iobyxmoadg
    protected final ppxfxbqfkf iobyxmoadg() {
        return this.f37543zdlpuopuiu;
    }

    @Override // gj.iobyxmoadg
    protected final void wkgbmnqykc(String keyQualifiedName, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(keyQualifiedName, "keyQualifiedName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        int iEablkybsjg = zoijcleaow().eablkybsjg(keyQualifiedName);
        int iIobyxmoadg = this.f37543zdlpuopuiu.iobyxmoadg();
        if (iIobyxmoadg == 0) {
            this.f37543zdlpuopuiu = new ojitshcjhn(value, iEablkybsjg);
            return;
        }
        if (iIobyxmoadg == 1) {
            ppxfxbqfkf ppxfxbqfkfVar = this.f37543zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(ppxfxbqfkfVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            ojitshcjhn ojitshcjhnVar = (ojitshcjhn) ppxfxbqfkfVar;
            if (ojitshcjhnVar.ppxfxbqfkf() == iEablkybsjg) {
                this.f37543zdlpuopuiu = new ojitshcjhn(value, iEablkybsjg);
                return;
            } else {
                wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
                this.f37543zdlpuopuiu = wkgbmnqykcVar;
                wkgbmnqykcVar.zoijcleaow(ojitshcjhnVar.ppxfxbqfkf(), ojitshcjhnVar.wkgbmnqykc());
            }
        }
        this.f37543zdlpuopuiu.zoijcleaow(iEablkybsjg, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eablkybsjg() {
        dxjokdxxww dxjokdxxwwVar = dxjokdxxww.f37542zdlpuopuiu;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(dxjokdxxwwVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(dxjokdxxwwVar);
    }
}
