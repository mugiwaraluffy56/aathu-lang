;;; aathu-mode.el --- Major mode for aathu-lang -*- lexical-binding: t; -*-
(define-derived-mode aathu-mode prog-mode "Aathu" "Major mode for editing aathu-lang files.")
(add-to-list 'auto-mode-alist '("\\.aathu\\'" . aathu-mode))
(provide 'aathu-mode)
;;; aathu-mode.el ends here
