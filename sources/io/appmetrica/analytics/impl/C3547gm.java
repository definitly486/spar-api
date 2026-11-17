package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3547gm implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Me f47348a = new Me();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Aa f47349b = new Aa();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Im f47350c = new Im();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3875u2 f47351d = new C3875u2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B3 f47352e = new B3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3825s2 f47353f = new C3825s2();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final R6 f47354g = new R6();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Em f47355h = new Em();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Fd f47356i = new Fd();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final X9 f47357j = new X9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3970xm fromModel(C3621jm c3621jm) {
        C3970xm c3970xm = new C3970xm();
        c3970xm.f48477s = c3621jm.f47564u;
        c3970xm.f48478t = c3621jm.f47565v;
        String str = c3621jm.f47544a;
        if (str != null) {
            c3970xm.f48459a = str;
        }
        List list = c3621jm.f47549f;
        if (list != null) {
            c3970xm.f48464f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c3621jm.f47550g;
        if (list2 != null) {
            c3970xm.f48465g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c3621jm.f47545b;
        if (list3 != null) {
            c3970xm.f48461c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c3621jm.f47551h;
        if (list4 != null) {
            c3970xm.f48473o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c3621jm.f47552i;
        if (map != null) {
            c3970xm.f48466h = this.f47354g.fromModel(map);
        }
        Le le2 = c3621jm.f47562s;
        if (le2 != null) {
            c3970xm.f48480v = this.f47348a.fromModel(le2);
        }
        String str2 = c3621jm.f47553j;
        if (str2 != null) {
            c3970xm.f48468j = str2;
        }
        String str3 = c3621jm.f47546c;
        if (str3 != null) {
            c3970xm.f48462d = str3;
        }
        String str4 = c3621jm.f47547d;
        if (str4 != null) {
            c3970xm.f48463e = str4;
        }
        String str5 = c3621jm.f47548e;
        if (str5 != null) {
            c3970xm.f48476r = str5;
        }
        c3970xm.f48467i = this.f47349b.fromModel(c3621jm.f47556m);
        String str6 = c3621jm.f47554k;
        if (str6 != null) {
            c3970xm.f48469k = str6;
        }
        String str7 = c3621jm.f47555l;
        if (str7 != null) {
            c3970xm.f48470l = str7;
        }
        c3970xm.f48471m = c3621jm.f47559p;
        c3970xm.f48460b = c3621jm.f47557n;
        c3970xm.f48475q = c3621jm.f47558o;
        RetryPolicyConfig retryPolicyConfig = c3621jm.f47563t;
        c3970xm.f48481w = retryPolicyConfig.maxIntervalSeconds;
        c3970xm.f48482x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c3621jm.f47560q;
        if (str8 != null) {
            c3970xm.f48472n = str8;
        }
        Hm hm2 = c3621jm.f47561r;
        if (hm2 != null) {
            this.f47350c.getClass();
            C3945wm c3945wm = new C3945wm();
            c3945wm.f48353a = hm2.f45949a;
            c3970xm.f48474p = c3945wm;
        }
        c3970xm.f48479u = c3621jm.f47566w;
        BillingConfig billingConfig = c3621jm.f47567x;
        if (billingConfig != null) {
            c3970xm.f48484z = this.f47351d.fromModel(billingConfig);
        }
        C4001z3 c4001z3 = c3621jm.f47568y;
        if (c4001z3 != null) {
            this.f47352e.getClass();
            C3771pm c3771pm = new C3771pm();
            c3771pm.f47894a = c4001z3.f48548a;
            c3970xm.f48483y = c3771pm;
        }
        C3800r2 c3800r2 = c3621jm.f47569z;
        if (c3800r2 != null) {
            c3970xm.A = this.f47353f.fromModel(c3800r2);
        }
        c3970xm.B = this.f47355h.fromModel(c3621jm.A);
        c3970xm.C = this.f47356i.fromModel(c3621jm.B);
        c3970xm.D = this.f47357j.fromModel(c3621jm.C);
        return c3970xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3621jm toModel(C3970xm c3970xm) {
        C3596im c3596im = new C3596im(this.f47349b.toModel(c3970xm.f48467i));
        c3596im.f47462a = c3970xm.f48459a;
        c3596im.f47471j = c3970xm.f48468j;
        c3596im.f47464c = c3970xm.f48462d;
        c3596im.f47463b = Arrays.asList(c3970xm.f48461c);
        c3596im.f47468g = Arrays.asList(c3970xm.f48465g);
        c3596im.f47467f = Arrays.asList(c3970xm.f48464f);
        c3596im.f47465d = c3970xm.f48463e;
        c3596im.f47466e = c3970xm.f48476r;
        c3596im.f47469h = Arrays.asList(c3970xm.f48473o);
        c3596im.f47472k = c3970xm.f48469k;
        c3596im.f47473l = c3970xm.f48470l;
        c3596im.f47478q = c3970xm.f48471m;
        c3596im.f47476o = c3970xm.f48460b;
        c3596im.f47477p = c3970xm.f48475q;
        c3596im.f47481t = c3970xm.f48477s;
        c3596im.f47482u = c3970xm.f48478t;
        c3596im.f47479r = c3970xm.f48472n;
        c3596im.f47483v = c3970xm.f48479u;
        c3596im.f47484w = new RetryPolicyConfig(c3970xm.f48481w, c3970xm.f48482x);
        c3596im.f47470i = this.f47354g.toModel(c3970xm.f48466h);
        C3895um c3895um = c3970xm.f48480v;
        if (c3895um != null) {
            this.f47348a.getClass();
            c3596im.f47475n = new Le(c3895um.f48213a, c3895um.f48214b);
        }
        C3945wm c3945wm = c3970xm.f48474p;
        if (c3945wm != null) {
            this.f47350c.getClass();
            c3596im.f47480s = new Hm(c3945wm.f48353a);
        }
        C3746om c3746om = c3970xm.f48484z;
        if (c3746om != null) {
            this.f47351d.getClass();
            c3596im.f47485x = new BillingConfig(c3746om.f47849a, c3746om.f47850b);
        }
        C3771pm c3771pm = c3970xm.f48483y;
        if (c3771pm != null) {
            this.f47352e.getClass();
            c3596im.f47486y = new C4001z3(c3771pm.f47894a);
        }
        C3721nm c3721nm = c3970xm.A;
        if (c3721nm != null) {
            c3596im.f47487z = this.f47353f.toModel(c3721nm);
        }
        C3920vm c3920vm = c3970xm.B;
        if (c3920vm != null) {
            this.f47355h.getClass();
            c3596im.A = new Dm(c3920vm.f48251a);
        }
        c3596im.B = this.f47356i.toModel(c3970xm.C);
        C3820rm c3820rm = c3970xm.D;
        if (c3820rm != null) {
            this.f47357j.getClass();
            c3596im.C = new W9(c3820rm.f48020a);
        }
        return new C3621jm(c3596im);
    }
}
