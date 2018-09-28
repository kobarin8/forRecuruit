package com.internousdev.bioral.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.bioral.dto.ReviewInfoDTO;;

public class ReviewInfoDTOTest {

	// getId
	@Test
	public void testGetId1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() throws Exception {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		try {
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() throws Exception {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		try {
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// setId
	@Test
	public void testSetId1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId4() throws Exception {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		try {
			int postalMax = Integer.parseInt("214748364");
			dto.setId(postalMax);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId5() throws Exception {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		try {
			int postalMin = Integer.parseInt("-214748364");
			dto.setId(postalMin);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// getProductId
	@Test
	public void testGetProductId1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4() throws Exception {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		try {
			int postalMax = Integer.parseInt("214748364");
			dto.setProductId(postalMax);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5() throws Exception {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		try {
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductId(postalMin);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// setProductId
	@Test
	public void testSetProductId1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId4() throws Exception {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		try {
			int postalMax = Integer.parseInt("214748364");
			dto.setProductId(postalMax);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5() throws Exception {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		try {
			int postalMin = Integer.parseInt("-214748364");
			dto.setProductId(postalMin);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	// getUserName
	@Test
	public void testGetUserName1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "0";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "2147483647";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "-2147483647";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName4() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "null";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName5() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName6() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = " ";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName7() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "　";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName8() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName9() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName10() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName11() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserName12() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	// setUserName
	@Test
	public void testSetUserName1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "0";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "2147483647";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "-2147483647";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName4() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "null";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName5() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName6() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = " ";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName7() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "　";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName8() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName9() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName10() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName11() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserName12() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserName(expected);
		String actual = dto.getUserName();
		assertEquals(expected, actual);
	}

	// getTitle
	@Test
	public void testGetTitle1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "0";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "2147483647";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "-2147483647";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle4() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "null";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle5() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle6() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = " ";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle7() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "　";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle8() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle9() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle10() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle11() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTitle12() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	// setTitle
	@Test
	public void testSetTitle1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "0";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "2147483647";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "-2147483647";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle4() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "null";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle5() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle6() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = " ";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle7() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "　";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle8() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle9() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle10() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle11() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTitle12() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setTitle(expected);
		String actual = dto.getTitle();
		assertEquals(expected, actual);
	}

	// getPoint
	@Test
	public void testGetPoint1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "0";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "2147483647";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "-2147483647";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint4() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "null";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint5() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint6() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = " ";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint7() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "　";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint8() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint9() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint10() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint11() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPoint12() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	// setPoint
	@Test
	public void testSetPoint1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "0";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "2147483647";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "-2147483647";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint4() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "null";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint5() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint6() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = " ";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint7() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "　";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint8() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint9() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint10() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint11() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPoint12() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPoint(expected);
		String actual = dto.getPoint();
		assertEquals(expected, actual);
	}

	// getReviewComment
	@Test
	public void testGetReviewComment1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "0";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "2147483647";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "-2147483647";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment4() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "null";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment5() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment6() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = " ";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment7() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "　";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment8() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment9() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment10() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment11() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReviewComment12() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	// setReviewComment
	@Test
	public void testSetReviewComment1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "0";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment2() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "2147483647";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment3() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "-2147483647";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment4() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "null";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment5() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment6() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = " ";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment7() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "　";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment8() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment9() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment10() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment11() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReviewComment12() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setReviewComment(expected);
		String actual = dto.getReviewComment();
		assertEquals(expected, actual);
	}

	// getRegistDate
	@Test
	public void testGetInsertDate1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		Date expected = null;

		dto.setInsertDate(expected);
		Date actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetInsertDate2() throws ParseException {
		ReviewInfoDTO dto = new ReviewInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}

	// setRegistDate
	@Test
	public void testSetInsertDate1() {
		ReviewInfoDTO dto = new ReviewInfoDTO();
		Date expected = null;

		dto.setInsertDate(expected);
		Date actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetInsertDate2() throws ParseException {
		ReviewInfoDTO dto = new ReviewInfoDTO();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}

}
