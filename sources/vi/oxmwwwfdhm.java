package vi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oxmwwwfdhm extends mh.wwaezpbzkn {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final yi.agtfadlqog f116945lereixgezr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxmwwwfdhm(ii.ppxfxbqfkf fqName, yi.agtfadlqog storageManager, jh.lmojexxdyd module) {
        super(module, fqName);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fqName, "fqName");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(storageManager, "storageManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(module, "module");
        this.f116945lereixgezr = storageManager;
    }

    public boolean ageimvtcrz(ii.gxszxtbevo name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        si.gtknphoqwx gtknphoqwxVarAgtfadlqog = agtfadlqog();
        return (gtknphoqwxVarAgtfadlqog instanceof xi.iwizpuwonk) && ((xi.iwizpuwonk) gtknphoqwxVarAgtfadlqog).zdlpuopuiu().contains(name);
    }

    public abstract void fyldjkxazc(agtfadlqog agtfadlqogVar);

    public abstract btonecajqb wizcaqwiak();
}
