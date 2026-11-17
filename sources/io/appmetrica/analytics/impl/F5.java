package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class F5 implements L9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q9 f45787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f45790d;

    public F5(Q9 q13, List<? extends Y8> list, List<? extends Y8> list2, C3654l5 c3654l5) {
        this.f45787a = q13;
        this.f45788b = list;
        this.f45789c = list2;
        Objects.toString(c3654l5);
        this.f45790d = new AtomicBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:1: B:19:0x0039->B:31:?, LOOP_END, SYNTHETIC] */
    public final boolean a() {
        List list;
        Iterator it;
        List list2 = this.f45789c;
        if (list2.isEmpty() || list2.isEmpty()) {
            list = this.f45788b;
            if (!list.isEmpty() && !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (((Y8) it.next()).b()) {
                        return true;
                    }
                }
            }
        } else {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!((Y8) it2.next()).b()) {
                }
            }
            list = this.f45788b;
            if (!list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (((Y8) it.next()).b()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void b() {
        this.f45790d.set(false);
    }

    public final void c() {
        this.f45790d.set(true);
    }

    public final void d() {
        if (this.f45790d.get()) {
            List list = this.f45789c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((Y8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((C3622jn) this.f45787a).c();
        }
    }

    public final void e() {
        if (this.f45790d.get() && a()) {
            ((C3622jn) this.f45787a).c();
        }
    }

    public final void f() {
        if (this.f45790d.get() && a()) {
            ((C3622jn) this.f45787a).b();
        }
    }
}
