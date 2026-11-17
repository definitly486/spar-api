package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.vdvldrhtss;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r8.rgvfuqvkyq;

/* JADX INFO: loaded from: classes2.dex */
public class Registry {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final u1.eablkybsjg f20588btonecajqb;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final com.bumptech.glide.load.data.gxszxtbevo f20590eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final y8.gxszxtbevo f20591gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final rgvfuqvkyq f20592iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final b9.zoijcleaow f20593lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final b9.eablkybsjg f20595ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final b9.gxszxtbevo f20596wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final b9.iobyxmoadg f20597zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final b9.wkgbmnqykc f20594nufgyqmvbu = new b9.wkgbmnqykc();

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final b9.ppxfxbqfkf f20589dxjokdxxww = new b9.ppxfxbqfkf();

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        u1.eablkybsjg eablkybsjgVarEablkybsjg = h9.iobyxmoadg.eablkybsjg();
        this.f20588btonecajqb = eablkybsjgVarEablkybsjg;
        this.f20592iobyxmoadg = new rgvfuqvkyq(eablkybsjgVarEablkybsjg);
        this.f20597zoijcleaow = new b9.iobyxmoadg();
        this.f20595ppxfxbqfkf = new b9.eablkybsjg();
        this.f20596wkgbmnqykc = new b9.gxszxtbevo();
        this.f20590eablkybsjg = new com.bumptech.glide.load.data.gxszxtbevo();
        this.f20591gxszxtbevo = new y8.gxszxtbevo();
        this.f20593lqeggnwhkg = new b9.zoijcleaow();
        zdlpuopuiu(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List gxszxtbevo(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f20595ppxfxbqfkf.wkgbmnqykc(cls, cls2)) {
            for (Class cls5 : this.f20591gxszxtbevo.zoijcleaow(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.dxjokdxxww(cls, cls4, cls5, this.f20595ppxfxbqfkf.zoijcleaow(cls, cls4), this.f20591gxszxtbevo.iobyxmoadg(cls4, cls5), this.f20588btonecajqb));
            }
        }
        return arrayList;
    }

    public boolean agtfadlqog(n8.ppxfxbqfkf ppxfxbqfkfVar) {
        return this.f20596wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar.ppxfxbqfkf()) != null;
    }

    public List btonecajqb(Class cls, Class cls2, Class cls3) {
        List listIobyxmoadg = this.f20594nufgyqmvbu.iobyxmoadg(cls, cls2, cls3);
        if (listIobyxmoadg == null) {
            listIobyxmoadg = new ArrayList();
            Iterator it = this.f20592iobyxmoadg.ppxfxbqfkf(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f20595ppxfxbqfkf.wkgbmnqykc((Class) it.next(), cls2)) {
                    if (!this.f20591gxszxtbevo.zoijcleaow(cls4, cls3).isEmpty() && !listIobyxmoadg.contains(cls4)) {
                        listIobyxmoadg.add(cls4);
                    }
                }
            }
            this.f20594nufgyqmvbu.zoijcleaow(cls, cls2, cls3, Collections.unmodifiableList(listIobyxmoadg));
        }
        return listIobyxmoadg;
    }

    public com.bumptech.glide.load.data.eablkybsjg draadjrbmk(Object obj) {
        return this.f20590eablkybsjg.iobyxmoadg(obj);
    }

    public List dxjokdxxww(Object obj) {
        return this.f20592iobyxmoadg.wkgbmnqykc(obj);
    }

    public Registry eablkybsjg(String str, Class cls, Class cls2, l8.dxjokdxxww dxjokdxxwwVar) {
        this.f20595ppxfxbqfkf.iobyxmoadg(str, dxjokdxxwwVar, cls, cls2);
        return this;
    }

    public l8.btonecajqb gtknphoqwx(n8.ppxfxbqfkf ppxfxbqfkfVar) {
        l8.btonecajqb btonecajqbVarZoijcleaow = this.f20596wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar.ppxfxbqfkf());
        if (btonecajqbVarZoijcleaow != null) {
            return btonecajqbVarZoijcleaow;
        }
        throw new NoResultEncoderAvailableException(ppxfxbqfkfVar.ppxfxbqfkf());
    }

    public Registry iobyxmoadg(Class cls, Class cls2, l8.dxjokdxxww dxjokdxxwwVar) {
        eablkybsjg("legacy_append", cls, cls2, dxjokdxxwwVar);
        return this;
    }

    public Registry kcexrzcfyt(Class cls, Class cls2, r8.ojitshcjhn ojitshcjhnVar) {
        this.f20592iobyxmoadg.lqeggnwhkg(cls, cls2, ojitshcjhnVar);
        return this;
    }

    public List lqeggnwhkg() {
        List listZoijcleaow = this.f20593lqeggnwhkg.zoijcleaow();
        if (listZoijcleaow.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listZoijcleaow;
    }

    public vdvldrhtss nufgyqmvbu(Class cls, Class cls2, Class cls3) {
        vdvldrhtss vdvldrhtssVarIobyxmoadg = this.f20589dxjokdxxww.iobyxmoadg(cls, cls2, cls3);
        if (this.f20589dxjokdxxww.ppxfxbqfkf(vdvldrhtssVarIobyxmoadg)) {
            return null;
        }
        if (vdvldrhtssVarIobyxmoadg == null) {
            List listGxszxtbevo = gxszxtbevo(cls, cls2, cls3);
            vdvldrhtssVarIobyxmoadg = listGxszxtbevo.isEmpty() ? null : new vdvldrhtss(cls, cls2, cls3, listGxszxtbevo, this.f20588btonecajqb);
            this.f20589dxjokdxxww.wkgbmnqykc(cls, cls2, cls3, vdvldrhtssVarIobyxmoadg);
        }
        return vdvldrhtssVarIobyxmoadg;
    }

    public Registry ojitshcjhn(Class cls, Class cls2, r8.ojitshcjhn ojitshcjhnVar) {
        this.f20592iobyxmoadg.gxszxtbevo(cls, cls2, ojitshcjhnVar);
        return this;
    }

    public Registry oxmwwwfdhm(Class cls, Class cls2, y8.eablkybsjg eablkybsjgVar) {
        this.f20591gxszxtbevo.ppxfxbqfkf(cls, cls2, eablkybsjgVar);
        return this;
    }

    public Registry ppxfxbqfkf(Class cls, l8.wkgbmnqykc wkgbmnqykcVar) {
        this.f20597zoijcleaow.iobyxmoadg(cls, wkgbmnqykcVar);
        return this;
    }

    public Registry rgvfuqvkyq(ImageHeaderParser imageHeaderParser) {
        this.f20593lqeggnwhkg.iobyxmoadg(imageHeaderParser);
        return this;
    }

    public Registry vdvldrhtss(com.bumptech.glide.load.data.eablkybsjg.iobyxmoadg iobyxmoadgVar) {
        this.f20590eablkybsjg.zoijcleaow(iobyxmoadgVar);
        return this;
    }

    public l8.wkgbmnqykc wflxmlrfwp(Object obj) {
        l8.wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f20597zoijcleaow.zoijcleaow(obj.getClass());
        if (wkgbmnqykcVarZoijcleaow != null) {
            return wkgbmnqykcVarZoijcleaow;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    public Registry wkgbmnqykc(Class cls, l8.btonecajqb btonecajqbVar) {
        this.f20596wkgbmnqykc.iobyxmoadg(cls, btonecajqbVar);
        return this;
    }

    public final Registry zdlpuopuiu(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f20595ppxfxbqfkf.eablkybsjg(arrayList);
        return this;
    }

    public Registry zoijcleaow(Class cls, Class cls2, r8.ojitshcjhn ojitshcjhnVar) {
        this.f20592iobyxmoadg.iobyxmoadg(cls, cls2, ojitshcjhnVar);
        return this;
    }
}
