package androidx.work;

import android.net.Network;
import g6.gtknphoqwx;
import g6.iozdgvuglv;
import g6.stevsuqkhv;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import lg.btonecajqb;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private iozdgvuglv f13860btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f13861draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private stevsuqkhv f13862dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f13863eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private gtknphoqwx f13864gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Executor f13865gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private UUID f13866iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private btonecajqb f13867lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private r6.zoijcleaow f13868nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Set f13869ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private iobyxmoadg f13870wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private zoijcleaow f13871zoijcleaow;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public Network f13873ppxfxbqfkf;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public List f13872iobyxmoadg = Collections.emptyList();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public List f13874zoijcleaow = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, zoijcleaow zoijcleaowVar, Collection collection, iobyxmoadg iobyxmoadgVar, int i13, int i14, Executor executor, btonecajqb btonecajqbVar, r6.zoijcleaow zoijcleaowVar2, stevsuqkhv stevsuqkhvVar, iozdgvuglv iozdgvuglvVar, gtknphoqwx gtknphoqwxVar) {
        this.f13866iobyxmoadg = uuid;
        this.f13871zoijcleaow = zoijcleaowVar;
        this.f13869ppxfxbqfkf = new HashSet(collection);
        this.f13870wkgbmnqykc = iobyxmoadgVar;
        this.f13863eablkybsjg = i13;
        this.f13861draadjrbmk = i14;
        this.f13865gxszxtbevo = executor;
        this.f13867lqeggnwhkg = btonecajqbVar;
        this.f13868nufgyqmvbu = zoijcleaowVar2;
        this.f13862dxjokdxxww = stevsuqkhvVar;
        this.f13860btonecajqb = iozdgvuglvVar;
        this.f13864gtknphoqwx = gtknphoqwxVar;
    }

    public List btonecajqb() {
        return this.f13870wkgbmnqykc.f13872iobyxmoadg;
    }

    public btonecajqb draadjrbmk() {
        return this.f13867lqeggnwhkg;
    }

    public r6.zoijcleaow dxjokdxxww() {
        return this.f13868nufgyqmvbu;
    }

    public Network eablkybsjg() {
        return this.f13870wkgbmnqykc.f13873ppxfxbqfkf;
    }

    public List gtknphoqwx() {
        return this.f13870wkgbmnqykc.f13874zoijcleaow;
    }

    public iozdgvuglv gxszxtbevo() {
        return this.f13860btonecajqb;
    }

    public Executor iobyxmoadg() {
        return this.f13865gxszxtbevo;
    }

    public int lqeggnwhkg() {
        return this.f13863eablkybsjg;
    }

    public Set nufgyqmvbu() {
        return this.f13869ppxfxbqfkf;
    }

    public UUID ppxfxbqfkf() {
        return this.f13866iobyxmoadg;
    }

    public stevsuqkhv wflxmlrfwp() {
        return this.f13862dxjokdxxww;
    }

    public zoijcleaow wkgbmnqykc() {
        return this.f13871zoijcleaow;
    }

    public gtknphoqwx zoijcleaow() {
        return this.f13864gtknphoqwx;
    }
}
