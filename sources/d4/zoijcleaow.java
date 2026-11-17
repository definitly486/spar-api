package d4;

import c4.ppxfxbqfkf;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import v2.jyumaefscl;
import y2.cdpycssgdh;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow extends ppxfxbqfkf {
    private static jyumaefscl ppxfxbqfkf(cdpycssgdh cdpycssgdhVar) {
        cdpycssgdhVar.oxmwwwfdhm(12);
        int iWkgbmnqykc = (cdpycssgdhVar.wkgbmnqykc() + cdpycssgdhVar.nufgyqmvbu(12)) - 4;
        cdpycssgdhVar.oxmwwwfdhm(44);
        cdpycssgdhVar.kcexrzcfyt(cdpycssgdhVar.nufgyqmvbu(12));
        cdpycssgdhVar.oxmwwwfdhm(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strDraadjrbmk = null;
            if (cdpycssgdhVar.wkgbmnqykc() >= iWkgbmnqykc) {
                break;
            }
            cdpycssgdhVar.oxmwwwfdhm(48);
            int iNufgyqmvbu = cdpycssgdhVar.nufgyqmvbu(8);
            cdpycssgdhVar.oxmwwwfdhm(4);
            int iWkgbmnqykc2 = cdpycssgdhVar.wkgbmnqykc() + cdpycssgdhVar.nufgyqmvbu(12);
            String strDraadjrbmk2 = null;
            while (cdpycssgdhVar.wkgbmnqykc() < iWkgbmnqykc2) {
                int iNufgyqmvbu2 = cdpycssgdhVar.nufgyqmvbu(8);
                int iNufgyqmvbu3 = cdpycssgdhVar.nufgyqmvbu(8);
                int iWkgbmnqykc3 = cdpycssgdhVar.wkgbmnqykc() + iNufgyqmvbu3;
                if (iNufgyqmvbu2 == 2) {
                    int iNufgyqmvbu4 = cdpycssgdhVar.nufgyqmvbu(16);
                    cdpycssgdhVar.oxmwwwfdhm(8);
                    if (iNufgyqmvbu4 == 3) {
                        while (cdpycssgdhVar.wkgbmnqykc() < iWkgbmnqykc3) {
                            strDraadjrbmk = cdpycssgdhVar.draadjrbmk(cdpycssgdhVar.nufgyqmvbu(8), StandardCharsets.US_ASCII);
                            int iNufgyqmvbu5 = cdpycssgdhVar.nufgyqmvbu(8);
                            for (int i13 = 0; i13 < iNufgyqmvbu5; i13++) {
                                cdpycssgdhVar.kcexrzcfyt(cdpycssgdhVar.nufgyqmvbu(8));
                            }
                        }
                    }
                } else if (iNufgyqmvbu2 == 21) {
                    strDraadjrbmk2 = cdpycssgdhVar.draadjrbmk(iNufgyqmvbu3, StandardCharsets.US_ASCII);
                }
                cdpycssgdhVar.rgvfuqvkyq(iWkgbmnqykc3 * 8);
            }
            cdpycssgdhVar.rgvfuqvkyq(iWkgbmnqykc2 * 8);
            if (strDraadjrbmk != null && strDraadjrbmk2 != null) {
                arrayList.add(new iobyxmoadg(iNufgyqmvbu, strDraadjrbmk + strDraadjrbmk2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new jyumaefscl(arrayList);
    }

    @Override // c4.ppxfxbqfkf
    protected jyumaefscl zoijcleaow(c4.zoijcleaow zoijcleaowVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return ppxfxbqfkf(new cdpycssgdh(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
