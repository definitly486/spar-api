package com.auth0.android.jwt;

import com.google.gson.btonecajqb;
import com.google.gson.eablkybsjg;
import com.google.gson.gxszxtbevo;
import com.google.gson.lqeggnwhkg;
import com.google.gson.nufgyqmvbu;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class JWTDeserializer implements lqeggnwhkg {
    JWTDeserializer() {
    }

    private String ppxfxbqfkf(btonecajqb btonecajqbVar, String str) {
        if (btonecajqbVar.vdvldrhtss(str)) {
            return btonecajqbVar.rgvfuqvkyq(str).gxszxtbevo();
        }
        return null;
    }

    private List wkgbmnqykc(btonecajqb btonecajqbVar, String str) {
        List listEmptyList = Collections.emptyList();
        if (!btonecajqbVar.vdvldrhtss(str)) {
            return listEmptyList;
        }
        nufgyqmvbu nufgyqmvbuVarRgvfuqvkyq = btonecajqbVar.rgvfuqvkyq(str);
        if (!nufgyqmvbuVarRgvfuqvkyq.dxjokdxxww()) {
            return Collections.singletonList(nufgyqmvbuVarRgvfuqvkyq.gxszxtbevo());
        }
        eablkybsjg eablkybsjgVarZoijcleaow = nufgyqmvbuVarRgvfuqvkyq.zoijcleaow();
        ArrayList arrayList = new ArrayList(eablkybsjgVarZoijcleaow.size());
        for (int i13 = 0; i13 < eablkybsjgVarZoijcleaow.size(); i13++) {
            arrayList.add(eablkybsjgVarZoijcleaow.agtfadlqog(i13).gxszxtbevo());
        }
        return arrayList;
    }

    private Date zoijcleaow(btonecajqb btonecajqbVar, String str) {
        if (btonecajqbVar.vdvldrhtss(str)) {
            return new Date(btonecajqbVar.rgvfuqvkyq(str).eablkybsjg() * 1000);
        }
        return null;
    }

    @Override // com.google.gson.lqeggnwhkg
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public wkgbmnqykc deserialize(nufgyqmvbu nufgyqmvbuVar, Type type, gxszxtbevo gxszxtbevoVar) {
        if (nufgyqmvbuVar.btonecajqb() || !nufgyqmvbuVar.gtknphoqwx()) {
            throw new DecodeException("The token's payload had an invalid JSON format.");
        }
        btonecajqb btonecajqbVarPpxfxbqfkf = nufgyqmvbuVar.ppxfxbqfkf();
        String strPpxfxbqfkf = ppxfxbqfkf(btonecajqbVarPpxfxbqfkf, "iss");
        String strPpxfxbqfkf2 = ppxfxbqfkf(btonecajqbVarPpxfxbqfkf, "sub");
        Date dateZoijcleaow = zoijcleaow(btonecajqbVarPpxfxbqfkf, "exp");
        Date dateZoijcleaow2 = zoijcleaow(btonecajqbVarPpxfxbqfkf, "nbf");
        Date dateZoijcleaow3 = zoijcleaow(btonecajqbVarPpxfxbqfkf, "iat");
        String strPpxfxbqfkf3 = ppxfxbqfkf(btonecajqbVarPpxfxbqfkf, "jti");
        List listWkgbmnqykc = wkgbmnqykc(btonecajqbVarPpxfxbqfkf, "aud");
        HashMap map = new HashMap();
        for (Map.Entry entry : btonecajqbVarPpxfxbqfkf.ojitshcjhn()) {
            map.put(entry.getKey(), new ppxfxbqfkf((nufgyqmvbu) entry.getValue()));
        }
        return new wkgbmnqykc(strPpxfxbqfkf, strPpxfxbqfkf2, dateZoijcleaow, dateZoijcleaow2, dateZoijcleaow3, strPpxfxbqfkf3, listWkgbmnqykc, map);
    }
}
