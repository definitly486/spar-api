package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class S6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Tl f46496a = new Tl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f46497b = hg.tzroggbefp.dxjokdxxww();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f46498c = hg.tzroggbefp.dxjokdxxww();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IdentifiersResult f46499d;

    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap map;
        Map mapDxjokdxxww;
        List listA;
        String str;
        try {
            IdentifiersResult identifiersResult2 = this.f46499d;
            String str2 = identifiersResult2 != null ? identifiersResult2.f48647id : null;
            if (str2 == null || str2.length() == 0 || ((str = identifiersResult.f48647id) != null && str.length() != 0)) {
                this.f46499d = identifiersResult;
                String str3 = identifiersResult.f48647id;
                if (str3 == null) {
                    map = null;
                } else {
                    map = new HashMap();
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            try {
                                ArrayList arrayListA = Bb.a(new JSONArray(jSONObject.optString(next)));
                                if (arrayListA != null) {
                                    map.put(next, arrayListA);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (map != null) {
                    mapDxjokdxxww = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        List list = (List) entry.getValue();
                        mapDxjokdxxww.put(key, new IdentifiersResult(String.valueOf(io.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                    }
                } else {
                    mapDxjokdxxww = hg.tzroggbefp.dxjokdxxww();
                }
                this.f46498c = mapDxjokdxxww;
                LinkedHashMap linkedHashMap = new LinkedHashMap(hg.tzroggbefp.eablkybsjg(mapDxjokdxxww.size()));
                for (Map.Entry entry2 : mapDxjokdxxww.entrySet()) {
                    Object key2 = entry2.getKey();
                    String str4 = ((IdentifiersResult) entry2.getValue()).f48647id;
                    if (str4 == null) {
                        listA = null;
                    } else {
                        try {
                            listA = Bb.a(new JSONArray(str4));
                        } catch (Throwable unused3) {
                            listA = null;
                        }
                    }
                    if (listA == null) {
                        listA = hg.jyumaefscl.wflxmlrfwp();
                    }
                    linkedHashMap.put(key2, listA);
                }
                this.f46497b = linkedHashMap;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void a(List list, HashMap map) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f46497b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Tl tl2 = this.f46496a;
            String strA = Bb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f46499d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            map.put("appmetrica_custom_sdk_hosts", tl2.a(new IdentifiersResult(strA, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
