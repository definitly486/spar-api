package jb2;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public enum zoijcleaow {
    KOTLIN("kotlin"),
    UNITY(PluginErrorDetails.Platform.UNITY),
    FLUTTER(PluginErrorDetails.Platform.FLUTTER),
    UNREAL_ENGINE("unreal-engine"),
    GODOT("godot"),
    REACT_NATIVE("react-native");


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f51072yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f51074zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final zoijcleaow zoijcleaow(String str) {
            zoijcleaow zoijcleaowVar = zoijcleaow.KOTLIN;
            if (zdlpuopuiu.eablkybsjg(str, zoijcleaowVar.wkgbmnqykc())) {
                return zoijcleaowVar;
            }
            zoijcleaow zoijcleaowVar2 = zoijcleaow.UNITY;
            if (zdlpuopuiu.eablkybsjg(str, zoijcleaowVar2.wkgbmnqykc())) {
                return zoijcleaowVar2;
            }
            zoijcleaow zoijcleaowVar3 = zoijcleaow.FLUTTER;
            if (zdlpuopuiu.eablkybsjg(str, zoijcleaowVar3.wkgbmnqykc())) {
                return zoijcleaowVar3;
            }
            zoijcleaow zoijcleaowVar4 = zoijcleaow.UNREAL_ENGINE;
            if (zdlpuopuiu.eablkybsjg(str, zoijcleaowVar4.wkgbmnqykc())) {
                return zoijcleaowVar4;
            }
            zoijcleaow zoijcleaowVar5 = zoijcleaow.GODOT;
            if (zdlpuopuiu.eablkybsjg(str, zoijcleaowVar5.wkgbmnqykc())) {
                return zoijcleaowVar5;
            }
            zoijcleaow zoijcleaowVar6 = zoijcleaow.REACT_NATIVE;
            if (zdlpuopuiu.eablkybsjg(str, zoijcleaowVar6.wkgbmnqykc())) {
                return zoijcleaowVar6;
            }
            return null;
        }

        public final zoijcleaow iobyxmoadg(Map map) {
            zdlpuopuiu.btonecajqb(map, "map");
            Object obj = map.get("type");
            return zoijcleaow(obj instanceof String ? (String) obj : null);
        }

        private iobyxmoadg() {
        }
    }

    zoijcleaow(String str) {
        this.f51074zdlpuopuiu = str;
    }

    public final String wkgbmnqykc() {
        return this.f51074zdlpuopuiu;
    }
}
