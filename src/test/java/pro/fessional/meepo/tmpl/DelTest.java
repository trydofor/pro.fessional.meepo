package pro.fessional.meepo.tmpl;

import org.junit.Test;

/**
 * @author trydofor
 * @since 2020-10-28
 */
public class DelTest {
    @Test
    public void del1a3() {
        TmplHelp.assertTmpl("/template/del/delete-1a3-i.htm", "/template/del/delete-1a3-o.htm");
    }

    @Test
    public void delAll() {
        TmplHelp.assertTmpl("/template/del/delete-all-i.htm", "/template/del/delete-all-o.htm");
    }
}