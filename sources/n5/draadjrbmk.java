package n5;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oxmwwwfdhm f68798iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f68799zoijcleaow;

    public draadjrbmk(oxmwwwfdhm database) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(database, "database");
        this.f68798iobyxmoadg = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f68799zoijcleaow = setNewSetFromMap;
    }

    public final androidx.lifecycle.cqumvgiudr iobyxmoadg(String[] tableNames, boolean z13, Callable computeFunction) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tableNames, "tableNames");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(computeFunction, "computeFunction");
        return new androidx.room.lqeggnwhkg(this.f68798iobyxmoadg, this, z13, computeFunction, tableNames);
    }

    public final void ppxfxbqfkf(androidx.lifecycle.cqumvgiudr liveData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(liveData, "liveData");
        this.f68799zoijcleaow.remove(liveData);
    }

    public final void zoijcleaow(androidx.lifecycle.cqumvgiudr liveData) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(liveData, "liveData");
        this.f68799zoijcleaow.add(liveData);
    }
}
