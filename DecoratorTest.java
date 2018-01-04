package Parkhouse;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest implements KeyListener {
	Decorator d;
	KeyEvent e;
	String source = "";
	InputStream in = null;

	@Before
	public void setUp() {
		while (e.getKeyCode() == ) {
			source += e.getKeyChar();
		}
		try {
			in = new ByteArrayInputStream(source.getBytes(StandardCharsets.UTF_8.name()));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		d = new Decorator(in);
	}

	@Test
	public void inputString_expectAnyOutput() {
		try {
			System.out.println(d.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.e = e;

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
