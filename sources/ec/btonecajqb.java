package ec;

import android.util.Base64;
import android.util.JsonReader;
import dc.iozdgvuglv;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final mc.iobyxmoadg f31085iobyxmoadg = new oc.wkgbmnqykc().dxjokdxxww(dc.iobyxmoadg.f27494iobyxmoadg).btonecajqb(true).nufgyqmvbu();

    /* JADX INFO: Access modifiers changed from: private */
    interface iobyxmoadg {
        Object iobyxmoadg(JsonReader jsonReader);
    }

    private static List agtfadlqog(JsonReader jsonReader, iobyxmoadg iobyxmoadgVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(iobyxmoadgVar.iobyxmoadg(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.wkgbmnqykc.zoijcleaow cdpycssgdh(JsonReader jsonReader) throws IOException {
        iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.wkgbmnqykc.zoijcleaow.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                iobyxmoadgVarIobyxmoadg.zoijcleaow(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow cqumvgiudr(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.AbstractC0519iobyxmoadg abstractC0519iobyxmoadgIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0518zoijcleaow.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    abstractC0519iobyxmoadgIobyxmoadg.wkgbmnqykc(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0519iobyxmoadgIobyxmoadg.gxszxtbevo(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0519iobyxmoadgIobyxmoadg.eablkybsjg(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0519iobyxmoadgIobyxmoadg.zoijcleaow(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0519iobyxmoadgIobyxmoadg.ppxfxbqfkf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0519iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.iobyxmoadg draadjrbmk(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.iobyxmoadg.AbstractC0512iobyxmoadg abstractC0512iobyxmoadgIobyxmoadg = iozdgvuglv.eablkybsjg.iobyxmoadg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    abstractC0512iobyxmoadgIobyxmoadg.eablkybsjg(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0512iobyxmoadgIobyxmoadg.zoijcleaow(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0512iobyxmoadgIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0512iobyxmoadgIobyxmoadg.lqeggnwhkg(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0512iobyxmoadgIobyxmoadg.gxszxtbevo(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0512iobyxmoadgIobyxmoadg.wkgbmnqykc(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0512iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc esjtqupxsv(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0526wkgbmnqykc.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                iobyxmoadgVarIobyxmoadg.zoijcleaow(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.gxszxtbevo hcddaimhww(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.gxszxtbevo.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.eablkybsjg.gxszxtbevo.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                iobyxmoadgVarIobyxmoadg.zoijcleaow(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg iozdgvuglv(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.eablkybsjg.AbstractC0511eablkybsjg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildVersion":
                    iobyxmoadgVarIobyxmoadg.zoijcleaow(jsonReader.nextString());
                    break;
                case "jailbroken":
                    iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextBoolean());
                    break;
                case "version":
                    iobyxmoadgVarIobyxmoadg.eablkybsjg(jsonReader.nextString());
                    break;
                case "platform":
                    iobyxmoadgVarIobyxmoadg.wkgbmnqykc(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg istkbnxepw(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.AbstractC0517iobyxmoadg abstractC0517iobyxmoadgIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0516eablkybsjg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0517iobyxmoadgIobyxmoadg.zoijcleaow(agtfadlqog(jsonReader, new dxjokdxxww()));
                    break;
                case "name":
                    abstractC0517iobyxmoadgIobyxmoadg.wkgbmnqykc(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0517iobyxmoadgIobyxmoadg.ppxfxbqfkf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0517iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf iwizpuwonk(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.AbstractC0522iobyxmoadg abstractC0522iobyxmoadgIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.ppxfxbqfkf.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC0522iobyxmoadgIobyxmoadg.ppxfxbqfkf(agtfadlqog(jsonReader, new dxjokdxxww()));
                    break;
                case "reason":
                    abstractC0522iobyxmoadgIobyxmoadg.eablkybsjg(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0522iobyxmoadgIobyxmoadg.gxszxtbevo(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0522iobyxmoadgIobyxmoadg.zoijcleaow(iwizpuwonk(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0522iobyxmoadgIobyxmoadg.wkgbmnqykc(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0522iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow jyumaefscl(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0525zoijcleaow abstractC0525zoijcleaowIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0525zoijcleaowIobyxmoadg.zoijcleaow(wflxmlrfwp(jsonReader));
                    break;
                case "threads":
                    abstractC0525zoijcleaowIobyxmoadg.gxszxtbevo(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.lqeggnwhkg
                        @Override // ec.btonecajqb.iobyxmoadg
                        public final Object iobyxmoadg(JsonReader jsonReader2) {
                            return btonecajqb.istkbnxepw(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0525zoijcleaowIobyxmoadg.eablkybsjg(zynmafqrjb(jsonReader));
                    break;
                case "binaries":
                    abstractC0525zoijcleaowIobyxmoadg.ppxfxbqfkf(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.nufgyqmvbu
                        @Override // ec.btonecajqb.iobyxmoadg
                        public final Object iobyxmoadg(JsonReader jsonReader2) {
                            return btonecajqb.zdlpuopuiu(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0525zoijcleaowIobyxmoadg.wkgbmnqykc(iwizpuwonk(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0525zoijcleaowIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg kcexrzcfyt(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.AbstractC0514iobyxmoadg abstractC0514iobyxmoadgIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC0514iobyxmoadgIobyxmoadg.zoijcleaow(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.ppxfxbqfkf
                        @Override // ec.btonecajqb.iobyxmoadg
                        public final Object iobyxmoadg(JsonReader jsonReader2) {
                            return btonecajqb.lmojexxdyd(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC0514iobyxmoadgIobyxmoadg.ppxfxbqfkf(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0514iobyxmoadgIobyxmoadg.gxszxtbevo(jyumaefscl(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0514iobyxmoadgIobyxmoadg.lqeggnwhkg(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.zoijcleaow
                        @Override // ec.btonecajqb.iobyxmoadg
                        public final Object iobyxmoadg(JsonReader jsonReader2) {
                            return btonecajqb.rgvfuqvkyq(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0514iobyxmoadgIobyxmoadg.eablkybsjg(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.zoijcleaow
                        @Override // ec.btonecajqb.iobyxmoadg
                        public final Object iobyxmoadg(JsonReader jsonReader2) {
                            return btonecajqb.rgvfuqvkyq(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0514iobyxmoadgIobyxmoadg.nufgyqmvbu(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC0514iobyxmoadgIobyxmoadg.wkgbmnqykc(lmojexxdyd(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0514iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg lereixgezr(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parameterKey":
                    iobyxmoadgVarIobyxmoadg.zoijcleaow(jsonReader.nextString());
                    break;
                case "templateVersion":
                    iobyxmoadgVarIobyxmoadg.eablkybsjg(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    iobyxmoadgVarIobyxmoadg.wkgbmnqykc(ylkuphrtab(jsonReader));
                    break;
                case "parameterValue":
                    iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf lmojexxdyd(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.AbstractC0515iobyxmoadg abstractC0515iobyxmoadgIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.ppxfxbqfkf.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "pid":
                    abstractC0515iobyxmoadgIobyxmoadg.wkgbmnqykc(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC0515iobyxmoadgIobyxmoadg.eablkybsjg(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC0515iobyxmoadgIobyxmoadg.zoijcleaow(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC0515iobyxmoadgIobyxmoadg.ppxfxbqfkf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0515iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg ojitshcjhn(JsonReader jsonReader) throws IOException {
        iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.AbstractC0528iobyxmoadg abstractC0528iobyxmoadgIobyxmoadg = iozdgvuglv.iobyxmoadg.AbstractC0527iobyxmoadg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    abstractC0528iobyxmoadgIobyxmoadg.wkgbmnqykc(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0528iobyxmoadgIobyxmoadg.zoijcleaow(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0528iobyxmoadgIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0528iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.eablkybsjg.wkgbmnqykc oxmwwwfdhm(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.zoijcleaow zoijcleaowVarIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    zoijcleaowVarIobyxmoadg.ppxfxbqfkf(yggfygwlhe(jsonReader));
                    break;
                case "rollouts":
                    zoijcleaowVarIobyxmoadg.eablkybsjg(pmvmpeiblj(jsonReader));
                    break;
                case "app":
                    zoijcleaowVarIobyxmoadg.zoijcleaow(kcexrzcfyt(jsonReader));
                    break;
                case "log":
                    zoijcleaowVarIobyxmoadg.wkgbmnqykc(esjtqupxsv(jsonReader));
                    break;
                case "type":
                    zoijcleaowVarIobyxmoadg.lqeggnwhkg(jsonReader.nextString());
                    break;
                case "timestamp":
                    zoijcleaowVarIobyxmoadg.gxszxtbevo(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zoijcleaowVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg pkzmftpjix(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.zoijcleaow zoijcleaowVarIobyxmoadg = iozdgvuglv.eablkybsjg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    zoijcleaowVarIobyxmoadg.wflxmlrfwp(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    zoijcleaowVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
                    break;
                case "identifier":
                    zoijcleaowVarIobyxmoadg.gtknphoqwx(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    zoijcleaowVarIobyxmoadg.gxszxtbevo(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    zoijcleaowVarIobyxmoadg.eablkybsjg(vdvldrhtss(jsonReader));
                    break;
                case "events":
                    zoijcleaowVarIobyxmoadg.lqeggnwhkg(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.wkgbmnqykc
                        @Override // ec.btonecajqb.iobyxmoadg
                        public final Object iobyxmoadg(JsonReader jsonReader2) {
                            return btonecajqb.oxmwwwfdhm(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    zoijcleaowVarIobyxmoadg.draadjrbmk(iozdgvuglv(jsonReader));
                    break;
                case "app":
                    zoijcleaowVarIobyxmoadg.zoijcleaow(draadjrbmk(jsonReader));
                    break;
                case "user":
                    zoijcleaowVarIobyxmoadg.agtfadlqog(hcddaimhww(jsonReader));
                    break;
                case "generator":
                    zoijcleaowVarIobyxmoadg.nufgyqmvbu(jsonReader.nextString());
                    break;
                case "crashed":
                    zoijcleaowVarIobyxmoadg.wkgbmnqykc(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    zoijcleaowVarIobyxmoadg.dxjokdxxww(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zoijcleaowVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo pmvmpeiblj(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.gxszxtbevo.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("assignments")) {
                iobyxmoadgVarIobyxmoadg.zoijcleaow(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.gxszxtbevo
                    @Override // ec.btonecajqb.iobyxmoadg
                    public final Object iobyxmoadg(JsonReader jsonReader2) {
                        return btonecajqb.lereixgezr(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.ppxfxbqfkf rgvfuqvkyq(JsonReader jsonReader) throws IOException {
        iozdgvuglv.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.ppxfxbqfkf.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("key")) {
                iobyxmoadgVarIobyxmoadg.zoijcleaow(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.ppxfxbqfkf vdvldrhtss(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.eablkybsjg.ppxfxbqfkf.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    iobyxmoadgVarIobyxmoadg.dxjokdxxww(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    iobyxmoadgVarIobyxmoadg.eablkybsjg(jsonReader.nextString());
                    break;
                case "ram":
                    iobyxmoadgVarIobyxmoadg.nufgyqmvbu(jsonReader.nextLong());
                    break;
                case "arch":
                    iobyxmoadgVarIobyxmoadg.zoijcleaow(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    iobyxmoadgVarIobyxmoadg.wkgbmnqykc(jsonReader.nextLong());
                    break;
                case "cores":
                    iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextInt());
                    break;
                case "model":
                    iobyxmoadgVarIobyxmoadg.gxszxtbevo(jsonReader.nextString());
                    break;
                case "state":
                    iobyxmoadgVarIobyxmoadg.btonecajqb(jsonReader.nextInt());
                    break;
                case "modelClass":
                    iobyxmoadgVarIobyxmoadg.lqeggnwhkg(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.iobyxmoadg wflxmlrfwp(JsonReader jsonReader) throws IOException {
        iozdgvuglv.iobyxmoadg.zoijcleaow zoijcleaowVarIobyxmoadg = iozdgvuglv.iobyxmoadg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    zoijcleaowVarIobyxmoadg.zoijcleaow(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.iobyxmoadg
                        @Override // ec.btonecajqb.iobyxmoadg
                        public final Object iobyxmoadg(JsonReader jsonReader2) {
                            return btonecajqb.ojitshcjhn(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    zoijcleaowVarIobyxmoadg.wkgbmnqykc(jsonReader.nextInt());
                    break;
                case "pss":
                    zoijcleaowVarIobyxmoadg.gxszxtbevo(jsonReader.nextLong());
                    break;
                case "rss":
                    zoijcleaowVarIobyxmoadg.nufgyqmvbu(jsonReader.nextLong());
                    break;
                case "timestamp":
                    zoijcleaowVarIobyxmoadg.dxjokdxxww(jsonReader.nextLong());
                    break;
                case "processName":
                    zoijcleaowVarIobyxmoadg.eablkybsjg(jsonReader.nextString());
                    break;
                case "reasonCode":
                    zoijcleaowVarIobyxmoadg.lqeggnwhkg(jsonReader.nextInt());
                    break;
                case "traceFile":
                    zoijcleaowVarIobyxmoadg.btonecajqb(jsonReader.nextString());
                    break;
                case "importance":
                    zoijcleaowVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zoijcleaowVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv wwaezpbzkn(JsonReader jsonReader) throws IOException {
        iozdgvuglv.zoijcleaow zoijcleaowVarZoijcleaow = iozdgvuglv.zoijcleaow();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    zoijcleaowVarZoijcleaow.btonecajqb(yadqdtsiqt(jsonReader));
                    break;
                case "sdkVersion":
                    zoijcleaowVarZoijcleaow.draadjrbmk(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    zoijcleaowVarZoijcleaow.ppxfxbqfkf(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    zoijcleaowVarZoijcleaow.zoijcleaow(wflxmlrfwp(jsonReader));
                    break;
                case "buildVersion":
                    zoijcleaowVarZoijcleaow.wkgbmnqykc(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    zoijcleaowVarZoijcleaow.gxszxtbevo(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    zoijcleaowVarZoijcleaow.nufgyqmvbu(jsonReader.nextString());
                    break;
                case "installationUuid":
                    zoijcleaowVarZoijcleaow.dxjokdxxww(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    zoijcleaowVarZoijcleaow.lqeggnwhkg(jsonReader.nextString());
                    break;
                case "platform":
                    zoijcleaowVarZoijcleaow.gtknphoqwx(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    zoijcleaowVarZoijcleaow.eablkybsjg(jsonReader.nextString());
                    break;
                case "session":
                    zoijcleaowVarZoijcleaow.wflxmlrfwp(pkzmftpjix(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zoijcleaowVarZoijcleaow.iobyxmoadg();
    }

    private static iozdgvuglv.wkgbmnqykc yadqdtsiqt(JsonReader jsonReader) throws IOException {
        iozdgvuglv.wkgbmnqykc.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.wkgbmnqykc.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                iobyxmoadgVarIobyxmoadg.zoijcleaow(agtfadlqog(jsonReader, new iobyxmoadg() { // from class: ec.eablkybsjg
                    @Override // ec.btonecajqb.iobyxmoadg
                    public final Object iobyxmoadg(JsonReader jsonReader2) {
                        return btonecajqb.cdpycssgdh(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf yggfygwlhe(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.ppxfxbqfkf.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    iobyxmoadgVarIobyxmoadg.zoijcleaow(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextInt());
                    break;
                case "orientation":
                    iobyxmoadgVarIobyxmoadg.eablkybsjg(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    iobyxmoadgVarIobyxmoadg.wkgbmnqykc(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    iobyxmoadgVarIobyxmoadg.lqeggnwhkg(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    iobyxmoadgVarIobyxmoadg.gxszxtbevo(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow ylkuphrtab(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg iobyxmoadgVarIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.AbstractC0513eablkybsjg.zoijcleaow.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("variantId")) {
                iobyxmoadgVarIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                iobyxmoadgVarIobyxmoadg.zoijcleaow(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return iobyxmoadgVarIobyxmoadg.iobyxmoadg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg zdlpuopuiu(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.AbstractC0521iobyxmoadg abstractC0521iobyxmoadgIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0520iobyxmoadg.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "name":
                    abstractC0521iobyxmoadgIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0521iobyxmoadgIobyxmoadg.wkgbmnqykc(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0521iobyxmoadgIobyxmoadg.gxszxtbevo(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0521iobyxmoadgIobyxmoadg.zoijcleaow(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0521iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    private static iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc zynmafqrjb(JsonReader jsonReader) throws IOException {
        iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.AbstractC0524iobyxmoadg abstractC0524iobyxmoadgIobyxmoadg = iozdgvuglv.eablkybsjg.wkgbmnqykc.iobyxmoadg.zoijcleaow.AbstractC0523wkgbmnqykc.iobyxmoadg();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    abstractC0524iobyxmoadgIobyxmoadg.zoijcleaow(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0524iobyxmoadgIobyxmoadg.ppxfxbqfkf(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0524iobyxmoadgIobyxmoadg.wkgbmnqykc(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0524iobyxmoadgIobyxmoadg.iobyxmoadg();
    }

    public iozdgvuglv.eablkybsjg.wkgbmnqykc btonecajqb(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVarOxmwwwfdhm = oxmwwwfdhm(jsonReader);
                jsonReader.close();
                return wkgbmnqykcVarOxmwwwfdhm;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e13) {
            throw new IOException(e13);
        }
    }

    public String gtknphoqwx(iozdgvuglv.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        return f31085iobyxmoadg.zoijcleaow(wkgbmnqykcVar);
    }

    public String hkdspvbjdz(iozdgvuglv iozdgvuglvVar) {
        return f31085iobyxmoadg.zoijcleaow(iozdgvuglvVar);
    }

    public iozdgvuglv jpowsppfya(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                iozdgvuglv iozdgvuglvVarWwaezpbzkn = wwaezpbzkn(jsonReader);
                jsonReader.close();
                return iozdgvuglvVarWwaezpbzkn;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e13) {
            throw new IOException(e13);
        }
    }
}
