package com.alte.Tetris;

/**
 * 定义小尺寸的图像 I J L O S T Z
 */

public class BlockV4 {
	static final boolean[][][] Shape = {
			// I
			{ 
				{ false, false, false, false }, 
				{ true, true, true, true }, 
				{ false, false, false, false },
				{ false, false, false, false }
			},
			// J
			{ 
				{ true, false, false },
				{ true, true, true }, 
				{ false, false, false } 
			},
			// L
			{ 
				{ false, false, true }, 
				{ true, true, true }, 
				{ false, false, false }
			},
			// O
			{ 
				{ true, true }, 
				{ true, true } 
			},
			// S
			{ 
				{ false, true, true }, 
				{ true, true, false }, 
				{ false, false, false } 
			},
			// T
			{ 
				{ false, true, false }, 
				{ true, true, true }, 
				{ false, false, false } 
			},
			// Z
			{ 
				{ true, true, false }, 
				{ false, true, true }, 
				{ false, false, false } 
			} };
}
