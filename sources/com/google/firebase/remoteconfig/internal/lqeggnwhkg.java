package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final Date f24751nufgyqmvbu = new Date(0);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private JSONObject f24752eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private long f24753gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private JSONObject f24754iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private JSONArray f24755lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private Date f24756ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private JSONArray f24757wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private JSONObject f24758zoijcleaow;

    public static class zoijcleaow {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private long f24759eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private JSONArray f24760gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private JSONObject f24761iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private JSONArray f24762ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private JSONObject f24763wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Date f24764zoijcleaow;

        public zoijcleaow eablkybsjg(JSONObject jSONObject) {
            try {
                this.f24763wkgbmnqykc = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public zoijcleaow gxszxtbevo(JSONArray jSONArray) {
            try {
                this.f24760gxszxtbevo = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public lqeggnwhkg iobyxmoadg() {
            return new lqeggnwhkg(this.f24761iobyxmoadg, this.f24764zoijcleaow, this.f24762ppxfxbqfkf, this.f24763wkgbmnqykc, this.f24759eablkybsjg, this.f24760gxszxtbevo);
        }

        public zoijcleaow lqeggnwhkg(long j13) {
            this.f24759eablkybsjg = j13;
            return this;
        }

        public zoijcleaow ppxfxbqfkf(JSONArray jSONArray) {
            try {
                this.f24762ppxfxbqfkf = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public zoijcleaow wkgbmnqykc(Date date) {
            this.f24764zoijcleaow = date;
            return this;
        }

        public zoijcleaow zoijcleaow(JSONObject jSONObject) {
            try {
                this.f24761iobyxmoadg = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private zoijcleaow() {
            this.f24761iobyxmoadg = new JSONObject();
            this.f24764zoijcleaow = lqeggnwhkg.f24751nufgyqmvbu;
            this.f24762ppxfxbqfkf = new JSONArray();
            this.f24763wkgbmnqykc = new JSONObject();
            this.f24759eablkybsjg = 0L;
            this.f24760gxszxtbevo = new JSONArray();
        }
    }

    public static zoijcleaow draadjrbmk() {
        return new zoijcleaow();
    }

    private Map ppxfxbqfkf() throws JSONException {
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < btonecajqb().length(); i13++) {
            JSONObject jSONObject = btonecajqb().getJSONObject(i13);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                String string3 = jSONArray.getString(i14);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static lqeggnwhkg wkgbmnqykc(JSONObject jSONObject) {
        return zoijcleaow(new JSONObject(jSONObject.toString()));
    }

    static lqeggnwhkg zoijcleaow(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new lqeggnwhkg(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public JSONArray btonecajqb() {
        return this.f24755lqeggnwhkg;
    }

    public JSONObject dxjokdxxww() {
        return this.f24752eablkybsjg;
    }

    public JSONArray eablkybsjg() {
        return this.f24757wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lqeggnwhkg) {
            return this.f24754iobyxmoadg.toString().equals(((lqeggnwhkg) obj).toString());
        }
        return false;
    }

    public long gtknphoqwx() {
        return this.f24753gxszxtbevo;
    }

    public Set gxszxtbevo(lqeggnwhkg lqeggnwhkgVar) throws JSONException {
        JSONObject jSONObjectLqeggnwhkg = wkgbmnqykc(lqeggnwhkgVar.f24754iobyxmoadg).lqeggnwhkg();
        Map mapPpxfxbqfkf = ppxfxbqfkf();
        Map mapPpxfxbqfkf2 = lqeggnwhkgVar.ppxfxbqfkf();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = lqeggnwhkg().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!lqeggnwhkgVar.lqeggnwhkg().has(next)) {
                hashSet.add(next);
            } else if (!lqeggnwhkg().get(next).equals(lqeggnwhkgVar.lqeggnwhkg().get(next))) {
                hashSet.add(next);
            } else if ((dxjokdxxww().has(next) && !lqeggnwhkgVar.dxjokdxxww().has(next)) || (!dxjokdxxww().has(next) && lqeggnwhkgVar.dxjokdxxww().has(next))) {
                hashSet.add(next);
            } else if (dxjokdxxww().has(next) && lqeggnwhkgVar.dxjokdxxww().has(next) && !dxjokdxxww().getJSONObject(next).toString().equals(lqeggnwhkgVar.dxjokdxxww().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapPpxfxbqfkf.containsKey(next) != mapPpxfxbqfkf2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapPpxfxbqfkf.containsKey(next) && mapPpxfxbqfkf2.containsKey(next) && !((Map) mapPpxfxbqfkf.get(next)).equals(mapPpxfxbqfkf2.get(next))) {
                hashSet.add(next);
            } else {
                jSONObjectLqeggnwhkg.remove(next);
            }
        }
        Iterator<String> itKeys2 = jSONObjectLqeggnwhkg.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public int hashCode() {
        return this.f24754iobyxmoadg.hashCode();
    }

    public JSONObject lqeggnwhkg() {
        return this.f24758zoijcleaow;
    }

    public Date nufgyqmvbu() {
        return this.f24756ppxfxbqfkf;
    }

    public String toString() {
        return this.f24754iobyxmoadg.toString();
    }

    private lqeggnwhkg(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j13, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j13);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f24758zoijcleaow = jSONObject;
        this.f24756ppxfxbqfkf = date;
        this.f24757wkgbmnqykc = jSONArray;
        this.f24752eablkybsjg = jSONObject2;
        this.f24753gxszxtbevo = j13;
        this.f24755lqeggnwhkg = jSONArray2;
        this.f24754iobyxmoadg = jSONObject3;
    }
}
