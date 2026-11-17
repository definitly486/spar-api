package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3961xd extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f48426b;

    public C3961xd(C3828s5 c3828s5) {
        super(c3828s5);
        String strB = c3828s5.b().b();
        strB = strB == null ? "empty" : strB;
        kotlin.jvm.internal.tzroggbefp tzroggbefpVar = kotlin.jvm.internal.tzroggbefp.f60034iobyxmoadg;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strB}, 1));
        LinkedHashMap linkedHashMapA = Ia.j().n().a(strB);
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            arrayList.add(gg.cqumvgiudr.iobyxmoadg(entry.getValue(), new C3737od(c3828s5, (String) entry.getKey())));
        }
        this.f48426b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        if (!this.f47182a.f48049t.c()) {
            return false;
        }
        ArrayList<gg.vdvldrhtss> arrayList = this.f48426b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (gg.vdvldrhtss vdvldrhtssVar : arrayList) {
            ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) vdvldrhtssVar.iobyxmoadg();
            C3737od c3737od = (C3737od) vdvldrhtssVar.wkgbmnqykc();
            if (moduleServiceEventHandler.handle(new C3811rd(c3737od.f47828b, c3737od.f47827a, new C3787qd(c3737od.f47830d, c3737od.f47829c, c3655l6)), c3655l6)) {
                return true;
            }
        }
        return false;
    }
}
