package g4;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v2.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg extends c4.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Pattern f36173ppxfxbqfkf = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CharsetDecoder f36174iobyxmoadg = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CharsetDecoder f36175zoijcleaow = StandardCharsets.ISO_8859_1.newDecoder();

    private String ppxfxbqfkf(ByteBuffer byteBuffer) {
        try {
            String string = this.f36174iobyxmoadg.decode(byteBuffer).toString();
            this.f36174iobyxmoadg.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f36174iobyxmoadg.reset();
            byteBuffer.rewind();
            try {
                return this.f36175zoijcleaow.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f36175zoijcleaow.reset();
                byteBuffer.rewind();
            }
        } catch (Throwable th2) {
            this.f36174iobyxmoadg.reset();
            byteBuffer.rewind();
            throw th2;
        }
    }

    @Override // c4.ppxfxbqfkf
    protected jyumaefscl zoijcleaow(c4.zoijcleaow zoijcleaowVar, ByteBuffer byteBuffer) {
        String strPpxfxbqfkf = ppxfxbqfkf(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strPpxfxbqfkf == null) {
            return new jyumaefscl(new ppxfxbqfkf(bArr, null, null));
        }
        Matcher matcher = f36173ppxfxbqfkf.matcher(strPpxfxbqfkf);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strEablkybsjg = xa.zoijcleaow.eablkybsjg(strGroup);
                strEablkybsjg.hashCode();
                if (strEablkybsjg.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strEablkybsjg.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new jyumaefscl(new ppxfxbqfkf(bArr, str, str2));
    }
}
