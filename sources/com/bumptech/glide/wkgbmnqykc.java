package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc extends ContextWrapper {

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static final ojitshcjhn f21188gtknphoqwx = new iobyxmoadg();

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private c9.gxszxtbevo f21189btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final int f21190dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final List f21191eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final Map f21192gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o8.zoijcleaow f21193iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.btonecajqb f21194lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final eablkybsjg f21195nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final d9.lqeggnwhkg f21196ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final zoijcleaow.iobyxmoadg f21197wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final g9.gxszxtbevo.zoijcleaow f21198zoijcleaow;

    public wkgbmnqykc(Context context, o8.zoijcleaow zoijcleaowVar, g9.gxszxtbevo.zoijcleaow zoijcleaowVar2, d9.lqeggnwhkg lqeggnwhkgVar, zoijcleaow.iobyxmoadg iobyxmoadgVar, Map map, List list, com.bumptech.glide.load.engine.btonecajqb btonecajqbVar, eablkybsjg eablkybsjgVar, int i13) {
        super(context.getApplicationContext());
        this.f21193iobyxmoadg = zoijcleaowVar;
        this.f21196ppxfxbqfkf = lqeggnwhkgVar;
        this.f21197wkgbmnqykc = iobyxmoadgVar;
        this.f21191eablkybsjg = list;
        this.f21192gxszxtbevo = map;
        this.f21194lqeggnwhkg = btonecajqbVar;
        this.f21195nufgyqmvbu = eablkybsjgVar;
        this.f21190dxjokdxxww = i13;
        this.f21198zoijcleaow = g9.gxszxtbevo.iobyxmoadg(zoijcleaowVar2);
    }

    public Registry dxjokdxxww() {
        return (Registry) this.f21198zoijcleaow.get();
    }

    public ojitshcjhn eablkybsjg(Class cls) {
        ojitshcjhn ojitshcjhnVar = (ojitshcjhn) this.f21192gxszxtbevo.get(cls);
        if (ojitshcjhnVar == null) {
            for (Map.Entry entry : this.f21192gxszxtbevo.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ojitshcjhnVar = (ojitshcjhn) entry.getValue();
                }
            }
        }
        return ojitshcjhnVar == null ? f21188gtknphoqwx : ojitshcjhnVar;
    }

    public com.bumptech.glide.load.engine.btonecajqb gxszxtbevo() {
        return this.f21194lqeggnwhkg;
    }

    public d9.btonecajqb iobyxmoadg(ImageView imageView, Class cls) {
        return this.f21196ppxfxbqfkf.iobyxmoadg(imageView, cls);
    }

    public eablkybsjg lqeggnwhkg() {
        return this.f21195nufgyqmvbu;
    }

    public int nufgyqmvbu() {
        return this.f21190dxjokdxxww;
    }

    public List ppxfxbqfkf() {
        return this.f21191eablkybsjg;
    }

    public synchronized c9.gxszxtbevo wkgbmnqykc() {
        try {
            if (this.f21189btonecajqb == null) {
                this.f21189btonecajqb = (c9.gxszxtbevo) this.f21197wkgbmnqykc.build().tzroggbefp();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f21189btonecajqb;
    }

    public o8.zoijcleaow zoijcleaow() {
        return this.f21193iobyxmoadg;
    }
}
