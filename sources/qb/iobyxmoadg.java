package qb;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String[] f78374lqeggnwhkg = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    static final DateFormat f78375nufgyqmvbu = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final long f78376eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final long f78377gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f78378iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f78379ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Date f78380wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f78381zoijcleaow;

    public iobyxmoadg(String str, String str2, String str3, Date date, long j13, long j14) {
        this.f78378iobyxmoadg = str;
        this.f78381zoijcleaow = str2;
        this.f78379ppxfxbqfkf = str3;
        this.f78380wkgbmnqykc = date;
        this.f78376eablkybsjg = j13;
        this.f78377gxszxtbevo = j14;
    }

    static iobyxmoadg iobyxmoadg(sb.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar) {
        String str = ppxfxbqfkfVar.f105948wkgbmnqykc;
        if (str == null) {
            str = "";
        }
        return new iobyxmoadg(ppxfxbqfkfVar.f105949zoijcleaow, String.valueOf(ppxfxbqfkfVar.f105947ppxfxbqfkf), str, new Date(ppxfxbqfkfVar.f105946lqeggnwhkg), ppxfxbqfkfVar.f105943eablkybsjg, ppxfxbqfkfVar.f105944gxszxtbevo);
    }

    private static void lqeggnwhkg(Map map) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (String str : f78374lqeggnwhkg) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    static iobyxmoadg zoijcleaow(Map map) throws AbtException {
        lqeggnwhkg(map);
        try {
            return new iobyxmoadg((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f78375nufgyqmvbu.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e13) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e13);
        } catch (ParseException e14) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e14);
        }
    }

    String eablkybsjg() {
        return this.f78381zoijcleaow;
    }

    sb.iobyxmoadg.ppxfxbqfkf gxszxtbevo(String str) {
        sb.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVar = new sb.iobyxmoadg.ppxfxbqfkf();
        ppxfxbqfkfVar.f105945iobyxmoadg = str;
        ppxfxbqfkfVar.f105946lqeggnwhkg = wkgbmnqykc();
        ppxfxbqfkfVar.f105949zoijcleaow = this.f78378iobyxmoadg;
        ppxfxbqfkfVar.f105947ppxfxbqfkf = this.f78381zoijcleaow;
        ppxfxbqfkfVar.f105948wkgbmnqykc = TextUtils.isEmpty(this.f78379ppxfxbqfkf) ? null : this.f78379ppxfxbqfkf;
        ppxfxbqfkfVar.f105943eablkybsjg = this.f78376eablkybsjg;
        ppxfxbqfkfVar.f105944gxszxtbevo = this.f78377gxszxtbevo;
        return ppxfxbqfkfVar;
    }

    String ppxfxbqfkf() {
        return this.f78378iobyxmoadg;
    }

    long wkgbmnqykc() {
        return this.f78380wkgbmnqykc.getTime();
    }
}
