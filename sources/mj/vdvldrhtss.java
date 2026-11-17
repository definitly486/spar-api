package mj;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vdvldrhtss {
    /* JADX INFO: Access modifiers changed from: private */
    public static final draadjrbmk eablkybsjg(Matcher matcher, int i13, CharSequence charSequence) {
        if (matcher.find(i13)) {
            return new wflxmlrfwp(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final draadjrbmk gxszxtbevo(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new wflxmlrfwp(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zg.btonecajqb lqeggnwhkg(MatchResult matchResult) {
        return zg.gtknphoqwx.jyumaefscl(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zg.btonecajqb nufgyqmvbu(MatchResult matchResult, int i13) {
        return zg.gtknphoqwx.jyumaefscl(matchResult.start(i13), matchResult.end(i13));
    }
}
