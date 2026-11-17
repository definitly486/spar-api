package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Hh implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3828s5 f45913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f45914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H7 f45915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E9 f45916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3532g7 f45917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f45918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Gh f45922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3901v3 f45923k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PublicLogger f45924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uo f45925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC3685mb f45926n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3691mh f45927o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f45928p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Tb f45929q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f45930r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f45931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f45932t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f45933u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f45934v;

    public Hh(C3828s5 c3828s5, C3691mh c3691mh, Tb tb3, FullUrlFormer<C3965xh> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(c3828s5, c3691mh, tb3, fullUrlFormer, requestDataHolder, responseDataHolder, c3828s5.h(), c3828s5.o(), c3828s5.t(), requestBodyEncrypter);
    }

    public final E9 a(Gh gh2, List list, C3965xh c3965xh) {
        E9 e13 = new E9();
        C3932w9 c3932w9 = new C3932w9();
        c3932w9.f48285a = WrapUtils.getOrDefaultIfEmpty(this.f45915c.f45884b, c3965xh.getUuid());
        c3932w9.f48286b = WrapUtils.getOrDefaultIfEmpty(this.f45915c.f45883a, c3965xh.getDeviceId());
        this.f45919g = CodedOutputByteBufferNano.computeMessageSize(4, c3932w9) + this.f45919g;
        e13.f45707b = c3932w9;
        C3672ln c3672lnA = Ia.F.A();
        Eh eh2 = new Eh(this, e13);
        synchronized (c3672lnA) {
            c3672lnA.f47670a.a(eh2);
        }
        List list2 = gh2.f45857a;
        e13.f45706a = (B9[]) list2.toArray(new B9[list2.size()]);
        e13.f45708c = a(gh2.f45859c);
        e13.f45710e = (String[]) list.toArray(new String[list.size()]);
        this.f45919g = CodedOutputByteBufferNano.computeTagSize(8) + this.f45919g;
        return e13;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f45913a.f48031b.f47630b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f45928p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f45930r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f45931s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C3965xh) this.f45913a.f48040k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) Ia.F.y()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        Cursor cursorRawQuery;
        int iOptInt;
        C3532g7 c3532g7 = this.f45913a.f48034e;
        c3532g7.getClass();
        ArrayList arrayList = new ArrayList();
        c3532g7.f47288a.lock();
        try {
            SQLiteDatabase readableDatabase = c3532g7.f47290c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(Q5.f46412b, null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                            io.a(cursorRawQuery);
                            c3532g7.f47288a.unlock();
                        } catch (Throwable th2) {
                            io.a(cursorRawQuery);
                            c3532g7.f47288a.unlock();
                            throw th2;
                        }
                    }
                }
            } else {
                cursorRawQuery = null;
            }
            io.a(cursorRawQuery);
            c3532g7.f47288a.unlock();
        } catch (Throwable unused2) {
            cursorRawQuery = null;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.f45914b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f45914b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            H7 h13 = new H7();
            this.f45915c = h13;
            this.f45927o.f47709c = h13;
        } else {
            try {
                H7 h14 = new H7(new Ab(asString));
                this.f45915c = h14;
                this.f45927o.f47709c = h14;
            } catch (Throwable unused3) {
                H7 h15 = new H7();
                this.f45915c = h15;
                this.f45927o.f47709c = h15;
            }
        }
        C3965xh config = this.f45929q.getConfig();
        List list = config.f48451w;
        if (io.a((Collection) list)) {
            return false;
        }
        this.f45928p.setHosts(config.f48445q);
        if (!config.t() || io.a((Collection) this.f45928p.getAllHosts())) {
            this.f45934v = true;
            return false;
        }
        this.f45918f = null;
        Gh ghA = a(config);
        this.f45922j = ghA;
        if (ghA.f45857a.isEmpty()) {
            return false;
        }
        uo uoVar = this.f45925m;
        synchronized (uoVar) {
            iOptInt = uoVar.f48216a.a().optInt("report_request_id", -1);
        }
        int i13 = iOptInt + 1;
        this.f45933u = i13;
        this.f45927o.f47711e = i13;
        E9 e9A = a(this.f45922j, list, config);
        this.f45916d = e9A;
        this.f45918f = this.f45922j.f45858b;
        this.f45932t.prepareAndSetPostData(MessageNano.toByteArray(e9A));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f45932t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z13) {
        String strA;
        if (z13) {
            a(false);
        } else if (this.f45931s.getResponseCode() == 400) {
            a(true);
        }
        if (z13) {
            for (int i13 = 0; i13 < this.f45922j.f45857a.size(); i13++) {
                for (C4007z9 c4007z9 : ((B9) this.f45922j.f45857a.get(i13)).f45518c) {
                    if (c4007z9 != null && (strA = AbstractC3464dg.a(c4007z9)) != null) {
                        this.f45924l.info(strA, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f45932t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th2) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f45934v = true;
        this.f45913a.f48034e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f45934v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((F5) this.f45913a.f48045p).f45790d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f45913a.f48034e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((F5) this.f45913a.f48045p).f45790d.set(true);
        if (this.f45934v) {
            ((F5) this.f45913a.f48045p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public Hh(C3828s5 c3828s5, C3691mh c3691mh, Tb tb3, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, C3532g7 c3532g7, PublicLogger publicLogger, uo uoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(c3828s5, publicLogger, c3532g7, c3691mh, uoVar, tb3, new C3901v3(1024000, "event value in ReportTask", publicLogger), AbstractC3849t1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public Hh(C3828s5 c3828s5, PublicLogger publicLogger, C3532g7 c3532g7, C3691mh c3691mh, uo uoVar, Tb tb3, C3901v3 c3901v3, C3442ck c3442ck, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f45914b = new LinkedHashMap();
        this.f45919g = 0;
        this.f45920h = 0;
        this.f45921i = -1;
        this.f45934v = false;
        this.f45932t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f45927o = c3691mh;
        this.f45913a = c3828s5;
        this.f45917e = c3532g7;
        this.f45924l = publicLogger;
        this.f45923k = c3901v3;
        this.f45925m = uoVar;
        this.f45929q = tb3;
        this.f45926n = c3442ck;
        this.f45930r = requestDataHolder;
        this.f45931s = responseDataHolder;
        this.f45928p = fullUrlFormer;
    }

    public static C3857t9[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C3857t9[] c3857t9Arr = new C3857t9[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i13 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                C3857t9 c3857t9 = new C3857t9();
                c3857t9.f48114a = next;
                c3857t9.f48115b = jSONObject.getString(next);
                c3857t9Arr[i13] = c3857t9;
            } catch (Throwable unused) {
            }
            i13++;
        }
        return c3857t9Arr;
    }

    public final void a(boolean z13) {
        uo uoVar = this.f45925m;
        int i13 = this.f45933u;
        synchronized (uoVar) {
            vo voVar = uoVar.f48216a;
            voVar.a(voVar.a().put("report_request_id", i13));
        }
        B9[] b9Arr = this.f45916d.f45706a;
        for (int i14 = 0; i14 < b9Arr.length; i14++) {
            try {
                B9 b13 = b9Arr[i14];
                long jLongValue = ((Long) this.f45918f.get(i14)).longValue();
                Wk wk2 = (Wk) AbstractC3438cg.f47022b.get(b13.f45517b.f45458c);
                if (wk2 == null) {
                    wk2 = Wk.FOREGROUND;
                }
                this.f45917e.a(jLongValue, wk2.f46734a, b13.f45518c.length, z13);
                AbstractC3438cg.a(b13);
            } catch (Throwable unused) {
            }
        }
        C3532g7 c3532g7 = this.f45917e;
        long jA = this.f45913a.f48039j.a();
        c3532g7.f47289b.lock();
        try {
            if (S5.f46493a.booleanValue()) {
                c3532g7.d();
            }
            SQLiteDatabase writableDatabase = c3532g7.f47290c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", Q5.f46413c, new String[]{String.valueOf(jA)});
            }
        } catch (Throwable unused2) {
        }
        c3532g7.f47289b.unlock();
    }

    public final Gh a(C3965xh c3965xh) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorA = a();
            if (cursorA != null) {
                JSONObject jSONObject2 = jSONObject;
                C3525g0 c3525g0 = null;
                while (cursorA.moveToNext() && this.f45920h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursorA, contentValues);
                        O7 model = new P7(null, 1, null).toModel(contentValues);
                        Long l13 = model.f46310a;
                        if (l13 != null) {
                            N7 n13 = model.f46313d;
                            D9 d9A = AbstractC3438cg.a(n13.f46252a, n13.f46253b, n13.f46254c);
                            String locale = c3965xh.getLocale();
                            Wk wk2 = model.f46311b;
                            A9 a13 = new A9();
                            a13.f45456a = d9A;
                            a13.f45457b = locale;
                            if (wk2 != null) {
                                Integer num = (Integer) AbstractC3438cg.f47021a.get(wk2);
                                a13.f45458c = num != null ? num.intValue() : 0;
                            }
                            int iComputeUInt64Size = this.f45919g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f45919g = iComputeUInt64Size;
                            int iComputeMessageSize = iComputeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, a13);
                            this.f45919g = iComputeMessageSize;
                            if (iComputeMessageSize >= 250880) {
                                break;
                            }
                            Fh fhA = a(l13.longValue(), a13, c3965xh, arrayList3, arrayList.size());
                            if (fhA == null) {
                                continue;
                            } else {
                                if (c3525g0 == null) {
                                    c3525g0 = fhA.f45820b;
                                } else {
                                    if (!c3525g0.equals(fhA.f45820b)) {
                                        break;
                                    }
                                    break;
                                }
                                arrayList2.add(l13);
                                arrayList.add(fhA.f45819a);
                                if (!TextUtils.isEmpty(fhA.f45820b.f47268a)) {
                                    try {
                                        jSONObject2 = new JSONObject(fhA.f45820b.f47268a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (fhA.f45821c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorA;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            io.a(cursor);
                        } catch (Throwable th3) {
                            io.a(cursor);
                            throw th3;
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            io.a(cursorA);
        } catch (Throwable th4) {
            th = th4;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f45926n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new Gh(arrayList, arrayList2, jSONObject);
    }

    public static C3525g0 a(ContentValues contentValues) {
        A7 model = new B7(null, 1, null).toModel(contentValues);
        return new C3525g0((String) WrapUtils.getOrDefault(model.f45448g.f48557g, ""), ((Long) WrapUtils.getOrDefault(model.f45448g.f48558h, 0L)).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:69:0x010f  */
    public final Fh a(long j13, A9 a13, C3965xh c3965xh, ArrayList arrayList, int i13) {
        Cursor cursorA;
        Fh fh2;
        C4007z9 c4007z9A;
        int iComputeMessageSize;
        C3758p9 c3758p9;
        boolean z13 = true;
        B9 b13 = new B9();
        b13.f45516a = j13;
        b13.f45517b = a13;
        Wk wk2 = (Wk) AbstractC3438cg.f47022b.get(a13.f45458c);
        if (wk2 == null) {
            wk2 = Wk.FOREGROUND;
        }
        try {
            cursorA = a(j13, wk2);
            if (cursorA != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C3525g0 c3525g0 = null;
                    while (true) {
                        if (cursorA.moveToNext() && this.f45920h < 100) {
                            ContentValues contentValues = new ContentValues();
                            DBUtils.cursorRowToContentValues(cursorA, contentValues);
                            try {
                                C3534g9 c3534g9 = new C3534g9(contentValues);
                                EnumC3934wb enumC3934wb = c3534g9.f47309h;
                                if (enumC3934wb != null) {
                                    c3758p9 = (C3758p9) AbstractC3438cg.f47024d.get(enumC3934wb);
                                } else {
                                    Map map = AbstractC3438cg.f47021a;
                                    c3758p9 = null;
                                }
                                if (c3758p9 == null) {
                                    c3758p9 = C3758p9.f47867i;
                                }
                                try {
                                    c4007z9A = c3758p9.a(c3534g9, c3965xh);
                                } catch (Throwable th2) {
                                    th = th2;
                                    arrayList.add(th);
                                    c4007z9A = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            if (c4007z9A != null) {
                                C3525g0 c3525g0A = a(contentValues);
                                if (c3525g0 == null) {
                                    if (this.f45921i < 0) {
                                        try {
                                            C3857t9[] c3857t9ArrA = a(new JSONObject(c3525g0A.f47268a));
                                            if (c3857t9ArrA != null) {
                                                iComputeMessageSize = 0;
                                                for (C3857t9 c3857t9 : c3857t9ArrA) {
                                                    iComputeMessageSize += CodedOutputByteBufferNano.computeMessageSize(7, c3857t9);
                                                }
                                            } else {
                                                iComputeMessageSize = 0;
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        this.f45921i = iComputeMessageSize;
                                        this.f45919g += iComputeMessageSize;
                                    }
                                    c3525g0 = c3525g0A;
                                } else {
                                    if (!c3525g0.equals(c3525g0A)) {
                                        break;
                                    }
                                    break;
                                }
                                C3901v3 c3901v3 = this.f45923k;
                                byte[] bArr = c4007z9A.f48582e;
                                c3901v3.getClass();
                                byte[] bArrA = c3901v3.a(bArr);
                                byte[] bArr2 = c4007z9A.f48582e;
                                if (bArr2 != bArrA) {
                                    c4007z9A.f48586i = ((bArr2 == null ? 0 : bArr2.length) - (bArrA == null ? 0 : bArrA.length)) + c4007z9A.f48586i;
                                    c4007z9A.f48582e = bArrA;
                                }
                                this.f45919g += CodedOutputByteBufferNano.computeMessageSize(3, c4007z9A);
                                if (arrayList2.isEmpty() && i13 == 0) {
                                    if (this.f45919g >= 1048576) {
                                    }
                                } else if (this.f45919g >= 250880) {
                                }
                            }
                            arrayList2.add(c4007z9A);
                            this.f45920h++;
                        }
                        z13 = false;
                        break;
                    }
                    if (arrayList2.size() > 0) {
                        b13.f45518c = (C4007z9[]) arrayList2.toArray(new C4007z9[arrayList2.size()]);
                        fh2 = new Fh(b13, c3525g0, z13);
                    } else {
                        fh2 = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        arrayList.add(th);
                        return null;
                    } finally {
                        io.a(cursorA);
                    }
                }
            } else {
                fh2 = null;
            }
            io.a(cursorA);
            return fh2;
        } catch (Throwable th5) {
            th = th5;
            cursorA = null;
        }
    }

    public final Cursor a() {
        Cursor cursorQuery;
        C3532g7 c3532g7 = this.f45917e;
        LinkedHashMap linkedHashMap = this.f45914b;
        c3532g7.f47288a.lock();
        try {
            SQLiteDatabase readableDatabase = c3532g7.f47290c.getReadableDatabase();
            cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, C3532g7.a(linkedHashMap), C3532g7.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        } catch (Throwable unused) {
        }
        c3532g7.f47288a.unlock();
        return cursorQuery;
    }

    public final Cursor a(long j13, Wk wk2) {
        Cursor cursorQuery;
        C3532g7 c3532g7 = this.f45917e;
        c3532g7.f47288a.lock();
        try {
            SQLiteDatabase readableDatabase = c3532g7.f47290c.getReadableDatabase();
            cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j13), Integer.toString(wk2.f46734a)}, null, null, "number_in_session ASC", null) : null;
        } catch (Throwable unused) {
        }
        c3532g7.f47288a.unlock();
        return cursorQuery;
    }
}
