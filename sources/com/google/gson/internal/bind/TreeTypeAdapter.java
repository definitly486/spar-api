package com.google.gson.internal.bind;

import ce.ppxfxbqfkf;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.draadjrbmk;
import com.google.gson.gxszxtbevo;
import com.google.gson.lqeggnwhkg;
import com.google.gson.nufgyqmvbu;
import com.google.gson.vdvldrhtss;

/* JADX INFO: loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zoijcleaow f25019eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f25020gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final lqeggnwhkg f25021iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private volatile TypeAdapter f25022lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final be.iobyxmoadg f25023ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final vdvldrhtss f25024wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Gson f25025zoijcleaow;

    private static final class SingleTypeFactory implements vdvldrhtss {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final lqeggnwhkg f25026iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final Class f25027jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final boolean f25028yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final be.iobyxmoadg f25029zdlpuopuiu;

        SingleTypeFactory(Object obj, be.iobyxmoadg iobyxmoadgVar, boolean z13, Class cls) {
            lqeggnwhkg lqeggnwhkgVar = obj instanceof lqeggnwhkg ? (lqeggnwhkg) obj : null;
            this.f25026iwizpuwonk = lqeggnwhkgVar;
            com.google.gson.internal.iobyxmoadg.iobyxmoadg(lqeggnwhkgVar != null);
            this.f25029zdlpuopuiu = iobyxmoadgVar;
            this.f25028yggfygwlhe = z13;
            this.f25027jyumaefscl = cls;
        }

        @Override // com.google.gson.vdvldrhtss
        public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
            boolean zIsAssignableFrom;
            be.iobyxmoadg iobyxmoadgVar2 = this.f25029zdlpuopuiu;
            if (iobyxmoadgVar2 != null) {
                zIsAssignableFrom = iobyxmoadgVar2.equals(iobyxmoadgVar) || (this.f25028yggfygwlhe && this.f25029zdlpuopuiu.wkgbmnqykc() == iobyxmoadgVar.ppxfxbqfkf());
            } else {
                zIsAssignableFrom = this.f25027jyumaefscl.isAssignableFrom(iobyxmoadgVar.ppxfxbqfkf());
            }
            if (zIsAssignableFrom) {
                return new TreeTypeAdapter(null, this.f25026iwizpuwonk, gson, iobyxmoadgVar, this);
            }
            return null;
        }
    }

    private final class zoijcleaow implements gxszxtbevo {
        private zoijcleaow() {
        }
    }

    public TreeTypeAdapter(draadjrbmk draadjrbmkVar, lqeggnwhkg lqeggnwhkgVar, Gson gson, be.iobyxmoadg iobyxmoadgVar, vdvldrhtss vdvldrhtssVar, boolean z13) {
        this.f25019eablkybsjg = new zoijcleaow();
        this.f25021iobyxmoadg = lqeggnwhkgVar;
        this.f25025zoijcleaow = gson;
        this.f25023ppxfxbqfkf = iobyxmoadgVar;
        this.f25024wkgbmnqykc = vdvldrhtssVar;
        this.f25020gxszxtbevo = z13;
    }

    private TypeAdapter gxszxtbevo() {
        TypeAdapter typeAdapter = this.f25022lqeggnwhkg;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter typeAdapterOjitshcjhn = this.f25025zoijcleaow.ojitshcjhn(this.f25024wkgbmnqykc, this.f25023ppxfxbqfkf);
        this.f25022lqeggnwhkg = typeAdapterOjitshcjhn;
        return typeAdapterOjitshcjhn;
    }

    public static vdvldrhtss lqeggnwhkg(be.iobyxmoadg iobyxmoadgVar, Object obj) {
        return new SingleTypeFactory(obj, iobyxmoadgVar, iobyxmoadgVar.wkgbmnqykc() == iobyxmoadgVar.ppxfxbqfkf(), null);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter eablkybsjg() {
        return gxszxtbevo();
    }

    @Override // com.google.gson.TypeAdapter
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Object obj) {
        gxszxtbevo().wkgbmnqykc(ppxfxbqfkfVar, obj);
    }

    @Override // com.google.gson.TypeAdapter
    public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) {
        if (this.f25021iobyxmoadg == null) {
            return gxszxtbevo().zoijcleaow(iobyxmoadgVar);
        }
        nufgyqmvbu nufgyqmvbuVarIobyxmoadg = com.google.gson.internal.draadjrbmk.iobyxmoadg(iobyxmoadgVar);
        if (this.f25020gxszxtbevo && nufgyqmvbuVarIobyxmoadg.btonecajqb()) {
            return null;
        }
        return this.f25021iobyxmoadg.deserialize(nufgyqmvbuVarIobyxmoadg, this.f25023ppxfxbqfkf.wkgbmnqykc(), this.f25019eablkybsjg);
    }

    public TreeTypeAdapter(draadjrbmk draadjrbmkVar, lqeggnwhkg lqeggnwhkgVar, Gson gson, be.iobyxmoadg iobyxmoadgVar, vdvldrhtss vdvldrhtssVar) {
        this(draadjrbmkVar, lqeggnwhkgVar, gson, iobyxmoadgVar, vdvldrhtssVar, true);
    }
}
