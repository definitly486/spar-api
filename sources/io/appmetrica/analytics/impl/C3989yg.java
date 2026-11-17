package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3989yg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f48526a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Ag f48527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f48528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final to f48529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f48530e;

    public C3989yg(Context context, to toVar) {
        this.f48530e = context;
        this.f48529d = toVar;
        this.f48527b = toVar.b();
        this.f48528c = toVar.c();
    }

    public final void a() {
        if (this.f48528c) {
            return;
        }
        Context context = this.f48530e;
        InterfaceC3610jb interfaceC3610jbA = Ig.a(context, Ia.F.f46007d.a());
        Fg fg2 = (Fg) new C3814rg(this, new Ig(interfaceC3610jbA), new Ua(context), new Jg(context)).f47996f.getValue();
        try {
            interfaceC3610jbA.a(fg2);
        } catch (Throwable th2) {
            fg2.a(th2);
        }
    }

    public final synchronized void a(Cg cg2) {
        this.f48526a.add(cg2);
        if (this.f48528c) {
            cg2.a(this.f48527b);
        }
    }

    public final synchronized void a(Ag ag2) {
        Iterator it = this.f48526a.iterator();
        while (it.hasNext()) {
            ((Cg) it.next()).a(ag2);
        }
    }
}
